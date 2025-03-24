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
    public static void application() throws ParseException {

        final Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Welcome to the Office!");
        System.out.println("Please, insert dapartment's name: ");
        String departamentName = sc.nextLine();

        System.out.print("Enter worker data: ");
        String workerName = sc.nextLine();

        System.out.print("Enter worker level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Enter base salary data: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));


        System.out.println();
        System.out.println("How many contracts this worker has? ");
        int n = sc.nextInt();


        for (int i = 1; i <=n; i++) {
            System.out.println("Enter contract # " + i + " data:");
            System.out.print("Date (DD/MM/YYYY):");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value (Hours):");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (Hours):");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/yyyy): ");
        sc.nextLine(); // Consumir quebra de linha pendente

        String monthYear = sc.nextLine().trim(); // Lê e remove espaços extras

// Verifica se a entrada não está vazia e tem o formato esperado
        if (monthYear.isEmpty() || monthYear.length() < 7 || !monthYear.contains("/")) {
            System.out.println("Invalid input! Please enter the date in MM/yyyy format.");
        } else {
            int month = Integer.parseInt(monthYear.substring(0, 2));
            int year = Integer.parseInt(monthYear.substring(3));

            double income = worker.income(year, month);
            System.out.println("----------//----------");
            System.out.println("Name: " + workerName);
            System.out.println("Department: " + departamentName);
            System.out.println("Income for " + monthYear + ": " + income);
        }

        sc.close();
    }
}