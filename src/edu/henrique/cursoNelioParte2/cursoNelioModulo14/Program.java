package edu.henrique.cursoNelioParte2.cursoNelioModulo14;

import edu.henrique.cursoNelioParte2.cursoNelioModulo14.Entities.Department;
import edu.henrique.cursoNelioParte2.cursoNelioModulo14.Entities.Enums.WorkerLevel;
import edu.henrique.cursoNelioParte2.cursoNelioModulo14.Entities.HourContract;
import edu.henrique.cursoNelioParte2.cursoNelioModulo14.Entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void application () throws ParseException {

        final Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Welcome to the Office!");
        System.out.println("Please, insert dapartment's name: ");
        String departamentName = scanner.nextLine();

        System.out.print("Enter worker data: ");
        String workerName = scanner.nextLine();

        System.out.print("Enter worker level: ");
        String workerLevel = scanner.nextLine();

        System.out.print("Enter base salary data: ");
        Double baseSalary = scanner.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));


        System.out.println();
        System.out.println("How many contracts this worker has? ");
        int n = scanner.nextInt();

        for(int i = 1; i < n;i++) {
            System.out.println("Enter contract #" + i + "data:");
            System.out.print("Date (DD/MM/YYYY):");
            Date contractDate = sdf.parse(scanner.next());
            System.out.println("");
        }
        System.out.print("Value (Hours):");
        double valuePerHour = scanner.nextDouble();
        System.out.print("Duration (Hours):");
        int hours = scanner.nextInt();
        HourContract contract = new HourContract(contractDate, valuePerHour, hours);

    }

}
