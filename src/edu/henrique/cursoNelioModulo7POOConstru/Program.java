package edu.henrique.cursoNelioModulo7POOConstru;


// Construtor é uma operação expecial da classe, que executa no momento da instanciação do objeto
// Usando construtor

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void application() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //System.out.print("Name: " + product.name);
        //System.out.print("price: " + product.price);
        //System.out.print("QTD: " + product.quantity);

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        // --    //   --  //  --
        System.out.print("Price: ");
        double price = sc.nextDouble();
        // --    //   --  //  --
        Product product = new Product(name, price);

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
