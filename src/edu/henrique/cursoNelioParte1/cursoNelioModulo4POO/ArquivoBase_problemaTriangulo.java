package edu.henrique.cursoNelioParte1.cursoNelioModulo4POO;

import java.util.Locale;
import java.util.Scanner;

public class ArquivoBase_problemaTriangulo {
    public static void application(){

        double xa, xb, xc, ya, yb, yc;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        System.out.println("Put the first measure: ");
        xa = sc.nextDouble();
        System.out.println("Put the second measure: ");
        xb = sc.nextDouble();
        System.out.println("Put the third measure: ");
        xc = sc.nextDouble();


        System.out.println("Now, enter the measures of triangle Y: ");
        System.out.println("Put the first measure: ");
        ya = sc.nextDouble();
        System.out.println("Put the second measure: ");
        yb = sc.nextDouble();
        System.out.println("Put the third measure: ");
        yc = sc.nextDouble();


        double p = (xa + xb + xc) / 2.0;
        double areaX = Math.sqrt(p * (p - xa) *(p - xb) *(p - xc));


        p = (ya + yb + yc) / 2.0;
        double areaY = Math.sqrt(p * (p - ya) *(p - yb) *(p - yc));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);


        if (areaX > areaY){
          System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }






        sc.close();

    }
}
