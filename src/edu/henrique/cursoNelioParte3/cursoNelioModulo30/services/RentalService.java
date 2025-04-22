package edu.henrique.cursoNelioParte3.cursoNelioModulo30.services;

import edu.henrique.cursoNelioParte3.cursoNelioModulo30.entities.CarRental;
import edu.henrique.cursoNelioParte3.cursoNelioModulo30.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private BrazilTaxServices taxSercives;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxServices taxSercives) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxSercives = taxSercives;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes(); // Forma de coletar a duração
        double hours = minutes/60;

        double basicPayments;
        if(hours <= 12){
            basicPayments = pricePerHour * Math.ceil(hours); //Criando a regra de arredondamento no teto, para ajustar a regra
        }else{
            basicPayments = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxSercives.tax(basicPayments); // Fazendo a regra de imposto, porém apontando a tax para os dados do basicPayment

        carRental.setInvoice(new Invoice(basicPayments, tax));
    }
}
