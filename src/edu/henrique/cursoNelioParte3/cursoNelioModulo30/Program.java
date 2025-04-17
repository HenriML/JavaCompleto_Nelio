package edu.henrique.cursoNelioParte3.cursoNelioModulo30;

import edu.henrique.cursoNelioParte2.cursoNelioModulo25.model.entities.CarRental;
import edu.henrique.cursoNelioParte3.cursoNelioModulo30.Entities.Vehicle;

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

       CarRental cr = new CarRental(start, new Vehicle(carModel), finish);



        sc.close();
    }
}
