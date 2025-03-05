package edu.henrique.cursoNelioModulo4POO;

import java.util.Locale;
import java.util.Scanner;

public class ArquivoBase_problemaTrianguloPOO {
    public static void application(){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle(); //Instância da classe, ou seja, declaração de objeto
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        System.out.println("Put the first measure: ");
        x.a = sc.nextDouble();
        System.out.println("Put the second measure: ");
        x.b = sc.nextDouble();
        System.out.println("Put the third measure: ");
        x.c = sc.nextDouble();


        System.out.println("Now, enter the measures of triangle Y: ");
        System.out.println("Put the first measure: ");
        y.a = sc.nextDouble();
        System.out.println("Put the second measure: ");
        y.b = sc.nextDouble();
        System.out.println("Put the third measure: ");
        y.c = sc.nextDouble();


        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) *(p - x.b) *(p - x.c));


        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) *(p - y.b) *(p - y.c));

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
