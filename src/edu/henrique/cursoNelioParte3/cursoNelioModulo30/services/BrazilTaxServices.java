package edu.henrique.cursoNelioParte3.cursoNelioModulo30.services;

public class BrazilTaxServices {
    public double tax(double amount){
        if(amount <= 100){
            return amount * 0.2;
        }else{
            return amount * 0.15;
        }
    }
}
