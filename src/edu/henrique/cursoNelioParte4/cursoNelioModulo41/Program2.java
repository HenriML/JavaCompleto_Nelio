package edu.henrique.cursoNelioParte4.cursoNelioModulo41;

import edu.henrique.cursoNelioParte4.cursoNelioModulo40.entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {

    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        {

            list.add(new Product("TV ", 900.00));
            list.add(new Product("Notebook ", 1200.00));
            list.add(new Product("Tablet ", 450.00));
            list.add(new Product("Video-Game ", 4500.00));

            list.sort(Program2::compareProducts); // Passei a func compare products direto, com a referência da classe e o nome - Passei uma func como argumento de outra, ou seja, é uma função de primeira ordem, significando que posse ser passado como func para outra func  e ser retornado pela mesma
            list.forEach(System.out::println);
        }

    }
}

