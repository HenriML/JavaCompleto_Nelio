package edu.henrique.cursoNelioParte1.cursoNelioModulo3;

import java.util.Scanner;

public class para {
    public static void parafor() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0 ;i < n ;i++){
          int x = sc.nextInt();
          soma = soma + x;

          System.out.println(soma);
        }



            sc.close();
    }
}
