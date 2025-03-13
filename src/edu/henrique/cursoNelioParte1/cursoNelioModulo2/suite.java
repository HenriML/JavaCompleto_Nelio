package edu.henrique.cursoNelioParte1.cursoNelioModulo2;

import java.util.Scanner;

public class suite {
    public static void suitecase(){
      /*  Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        if (x == 1) {
            dia = "domingo";
        }
        else if (x == 2) {
            dia = "segunda";
        }
        else if (x == 3) {
            dia = "terca";
        }
        else if (x == 4) {
            dia = "quarta";
        }
        else if (x == 5) {
            dia = "quinta";
        }
        else if (x == 6) {
            dia = "sexta";
        }
        else if (x == 7) {
            dia = "sabado";
        }
        else {
            dia = "valor invalido";
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();

        Desse jeito, com encadeamento é ruim
        */

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terca";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sabado";
            default -> "valor invalido";
        };
        System.out.println("Dia da semana: " + dia);
        sc.close();


    }
}
