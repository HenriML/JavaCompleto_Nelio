package edu.henrique.cursoNelioParte4.cursoNelioModulo42;

import edu.henrique.cursoNelioParte4.cursoNelioModulo40.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void application() {


        List<Product> list = new ArrayList<>();
        {

            list.add(new Product("TV ", 900.00));
            list.add(new Product("Mouse ", 50.00));
            list.add(new Product("Tablet ", 350.50));
            list.add(new Product("HD Case ", 80.90));


//            list.removeIf(p ->p.getPrice() >=100); - Assim funciona implementando lambda, porém abaixo vou usar a interface
              list.removeIf();

            for(Product p: list ){
                System.out.println(p);
            }
        }
    }
}