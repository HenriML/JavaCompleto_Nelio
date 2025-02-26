package edu.henrique.cursoNelioModulo2;

import java.util.Scanner;

public class condic {
    public static void ifelsesimples(){

        int x = 3;

            System.out.println("Bom dia");

        if (x > 5) {
            System.out.println("Boa tarde");
        }

        System.out.println("Boa noite");

    }


    public static void ifelsecompos(){
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Que hora que é?");
        hora = sc.nextInt();


        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora > 12 && hora < 16) {
            System.out.println("Boa tarde");
        } else {
                System.out.println("Boa noite");
            }
        sc.close();
        }

}

