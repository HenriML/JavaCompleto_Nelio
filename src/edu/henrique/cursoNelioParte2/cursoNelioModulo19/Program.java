package edu.henrique.cursoNelioParte2.cursoNelioModulo19;

import edu.henrique.cursoNelioParte2.cursoNelioModulo19.Entities.Employee;
import edu.henrique.cursoNelioParte2.cursoNelioModulo19.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void application() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Welcome to the Enterprise!");

        System.out.println("Please, enter the number of employees:");
        int n = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");

            char ch;
            do {
                System.out.print("Is employee outsourced? (y/n): ");
                ch = sc.next().charAt(0);
                if (ch != 'y' && ch != 'n') {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            } while (ch != 'y' && ch != 'n'); // Repete até o usuário inserir um valor válido

            System.out.print("Name: ");
            sc.nextLine(); // Limpa o buffer do scanner
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }


        System.out.println();
        System.out.println("Payments: ");

        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ "+ emp.payment());
        }

        sc.close();
    }
}


/*
First try - need fix logic

Explicação das mudanças:
do-while para validar a entrada do usuário: O loop garante que o usuário só pode sair quando pressionar 'y' ou 'n'.

Corrigido if (ch != 'y' || ch != 'n'): O operador correto é && (E lógico), porque 'ch' nunca pode ser diferente de ambos ao mesmo tempo. A correção foi while (ch != 'y' && ch != 'n').

Adicionado list.add(emp); no else: Antes, o funcionário interno não era adicionado à lista.


for(int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + "data: ");
            System.out.print("Is employee outsorced? (y/n)");
            char ch = sc.next().charAt(0);
            if (ch != 'y' || ch != 'n') {
                System.out.println("You entered the wrong key.");
            } else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hours: ");
                double valuePerHour = sc.nextDouble();
                if (ch == 'y') {
                    System.out.println("Additional charge: ");
                    double additionalCharge = sc.nextDouble();
                    Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                    list.add(emp);
                }else{
                    Employee emp = new Employee(name, hours, valuePerHour);
                }

            }
        }
 */