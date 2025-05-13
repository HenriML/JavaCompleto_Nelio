package edu.henrique.cursoNelioParte4.cursoNelioModulo40;

import edu.henrique.cursoNelioParte4.cursoNelioModulo40.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Comparator serve para ordenar, por exempo comparando preço, ou nome em alfabética e usando o ToUpper para rodar.
// Expressão LAMBDA - A ideia é simplicidar e diminuir verbosidade, com "expressão anonima)

public class ProgramLambda {
    public static void application(){

    List<Product> list = new ArrayList<>();{

        list.add(new Product("TV ", 900.00));
        list.add(new Product("Notebook ", 1200.00));
        list.add(new Product("Tablet ", 450.00));
        list.add(new Product("Video-Game ", 4500.00));


        /*
        Dá para criar o comparator em tempo de execução, exemplo:


        Comparator<Product> comp = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
           return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        }
     };

        Substituir o list.sort por: list.sort(comp)




    E menos verboso ainda, é usando LAMBDA:


        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        }
        list.sort(comp) - Conhecido como Arrow function



        E também é possivel assim:

        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

         */

            list.sort(new MyComparator());


            for(Product p: list) {
                System.out.println(p);
            }
        }

    }
}
