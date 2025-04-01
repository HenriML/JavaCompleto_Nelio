package edu.henrique.cursoNelioParte2.cursoNelioModulo22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void application() {
        method1();

        System.out.println("End of program");

        }
    public static void method1() {
        System.out.println("***Método 1 - Start***");
        method2();
        System.out.println("***Método 1 - End***");
    }

    public static void method2() {
        System.out.println("***Método 2 - Start***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();// Imprime o rastreamento do stack - É possivel rastrear pelo erro dado como chegar na exceção.
        } catch (InputMismatchException g) {
            System.out.println("Input Error");

            // Se procurar pelo vetor com algo fora de número: Mismatch
            // Se procurar pelo vetor com algo fora de número: OutOfBounds
        }
        System.out.println("***Método 2 - End***");
        sc.close();
    }


}
