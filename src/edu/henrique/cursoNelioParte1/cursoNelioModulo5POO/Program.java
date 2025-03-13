package edu.henrique.cursoNelioParte1.cursoNelioModulo5POO;

import java.util.Scanner;
import java.util.Locale;


public class Program {
    public static void application() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        // --    //   --  //  --
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        // --    //   --  //  --
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        //System.out.println(product.name +", " + product.price + ", " + product.quantity);
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);


        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);


        sc.close();
    }
}
