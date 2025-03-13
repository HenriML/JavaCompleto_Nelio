package edu.henrique.cursoNelioParte1.cursoNelioModulo5POOExec;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void application(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter the employee info: ");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        // --    //   --  //  --
        System.out.print("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        // --    //   --  //  --
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println();

        System.out.print("Name: " + employee.name);
        System.out.println();
        System.out.print("Gross Salary: " + employee.GrossSalary);
        System.out.println();
        System.out.print("Taxes: " + employee.Tax);
        // Pode ser substituído pelo Employee direto, porém quero a visualização assim

        System.out.println();
        System.out.println();
        System.out.println("Employee: " + employee.name + " $ " + employee.NetSalary());

        System.out.println();
        System.out.println("Which percentage to increase salary?: ");
        int percentage = sc.nextInt();
        employee.IncreaseSalary(percentage);


        System.out.println();
        System.out.println("Updated data: " + employee.name + " " + employee.UpdateGrossSalary);




    }
}
