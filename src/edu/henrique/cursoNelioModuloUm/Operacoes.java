package edu.henrique.cursoNelioModuloUm;

//Casting em processamento de dados
public class Operacoes {
    public static void somando() {
        int a = 5, b = 3;
        System.out.println("Soma: " + (a + b));
    }

    public static void exemplo1() {
        int x = 5, y = 2*x;
        System.out.println(x);
        System.out.println(y);
    }
    public static void exemplo2() {
        int x = 5, y = 2*x;
        System.out.println(x);
        System.out.println(y);
    }

    public static void exemplo3() {
        double b = 6.0, B =8.0, h = 5.0, area;
        //float b = 6f, B =8f, h = 5f, area;

        area = (b + B) / 2.0 *h;
        //area = (b + B) / 2f *h;

        System.out.println(area);
    }

    public static void exemplo4() {
        int a = 5, b = 2;
        double resultado;

        resultado = (double) a / b;

        System.out.println(resultado);
    }

    public static void exemplo5() {
        double a = 5.0;
        int b =  (int) a;

        System.out.println(b);
    }


}

