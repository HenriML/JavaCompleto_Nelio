package edu.henrique.cursoNelioModulo9POO;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void application() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
/*

            Exemplo


        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){

            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        for(int j = 0; j < n; j++){
            sum += vect[j];
        }

        double avg = sum / n;

        System.out.println("The average is: " + avg);
  */


        int n = sc.nextInt();
        Product[] vect = new Product[n];


        for (int i = 0; i < n/*Vect.length poded ser usado ao invés de n*/; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;

        for (int j = 0; j < n; j++){
            sum += vect[j].getPrice();
        }

        double avg = sum / n;


        System.out.printf("Average price is: %.2f%n", avg);

        sc.close();
    }
}
