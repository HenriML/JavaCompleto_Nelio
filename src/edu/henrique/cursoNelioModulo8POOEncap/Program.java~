package edu.henrique.cursoNelioModulo8POOEncap;

//  Encapsulamento é um principio que visa em esconder detalhes de implementação de uma classe, expondo apenas o necessário e o que é seguro
// Tipo um rádio, que vai esconder tudo do user, deixando apenas acesso a botões para dar play a música.

// Atributo é apenas acessado por getters e setters em private


// Get -> Ele seta a info do atributo
// Set -> Ele altera a info do atributo - Ele sempre receberá um parametro e atribui com um this.


// Private - Só acessado pela própria classe
// Nada - Só acessado dentro do mesmo package
// protected - Só acessado pela mesma classe e classes filhas
// Public - Acessado pela mesma classe, classes filhas e classes em pacotes diferentes (público)

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void application() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        // --    //   --  //  --
        System.out.print("Price: ");
        double price = sc.nextDouble();
        // --    //   --  //  --
        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.print("Updated name: " + product.getName());

        product.setPrice(900.00);
        System.out.print("Updated name: " + product.getPrice());

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
