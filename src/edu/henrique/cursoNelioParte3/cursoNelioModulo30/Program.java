package edu.henrique.cursoNelioParte3.cursoNelioModulo30;

import edu.henrique.cursoNelioParte3.cursoNelioModulo30.entities.CarRental;
import edu.henrique.cursoNelioParte3.cursoNelioModulo30.entities.Vehicle;
import edu.henrique.cursoNelioParte3.cursoNelioModulo30.services.BrazilTaxServices;
import edu.henrique.cursoNelioParte3.cursoNelioModulo30.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void application() {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Enter with vehicle data: ");
        String carModel = sc.nextLine();
        System.out.println("Car rentend time: (dd/MM/yyyy hh:mm");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.println("Car rentend devolution: (dd/MM/yyyy hh:mm");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Put priced per hour:");
        double pricePerHour = sc.nextDouble();
        System.out.println("Put priced per day:");
        double pricePerDay = sc.nextDouble();


        RentalService rentalservice = new RentalService(pricePerDay, pricePerHour, new BrazilTaxServices());


        rentalservice.processInvoice(cr);

        System.out.println("Receipt");
        System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("Taxes " + cr.getInvoice().getTax());
        System.out.println("Total payment " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
