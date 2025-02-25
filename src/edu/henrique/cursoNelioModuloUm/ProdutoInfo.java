package edu.henrique.cursoNelioModuloUm;

import java.util.Locale;

public class ProdutoInfo {

    public static void executar() {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        exibirProdutos(product1, price1, product2, price2);
        exibirRegistro(age, code, gender);
        exibirMedidas(measure);
    }

    public static void exibirProdutos(String product1, double price1, String product2, double price2) {
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
    }

    public static void exibirRegistro(int age, int code, char gender) {
        System.out.printf("Record: %d years old, code %d, and gender: %c%n", age, code, gender);
    }

    public static void exibirMedidas(double measure) {
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}