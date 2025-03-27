package edu.henrique.cursoNelioParte2.cursoNelioModulo21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities.Enums.Color;
import edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities.Rectangle;
import edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities.Circle;
import edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities.Shape;

public class Program {
    public static void application() {

        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape # " + i + " Data: ");
            char ch;
            do {
                System.out.print("Rectangle or Cincle? (r/c): ");
                ch = sc.next().charAt(0);
                if (ch != 'r' && ch != 'c') {
                    System.out.println("Invalid input. Please enter 'r' or 'c'.");
                }
            } while (ch != 'r' && ch != 'c'); // Repete até o usuário inserir um valor válido
            System.out.println("");
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next()); // Como ele passa o sc como parametro, ao ser digitado, ele passa para o objeto color o que o user digitou.
            if (ch == 'r') {
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }

            System.out.println("");
            System.out.println("SHAPE AREAS: ");
            for(Shape shape : list){
                System.out.println(shape.area()); // Há o polimorfismo de áreas, então mesmo cada objeto tendo suas regras de subclasse, não dá erro. Polimorph fellas.
            }


        }
        sc.close();
    }
}