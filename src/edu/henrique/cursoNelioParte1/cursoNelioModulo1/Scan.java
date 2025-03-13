package edu.henrique.cursoNelioParte1.cursoNelioModulo1;

import java.util.Scanner;

public class Scan {

    public static void scannerando(){
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);
        sc.close();
    }

    public static void scannerando2(){
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Digite um número: ");
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);
        sc.close();
    }

    public static void scannerando3(){
        Scanner sc = new Scanner(System.in);

        double x;
        System.out.println("Digite um número: ");
        x = sc.nextDouble();
        System.out.printf("Você digitou: %.1f%n", x);
        sc.close(); //É preciso se atentar com a ASCI, por causa do .e , - Pode usar a Java.Util.Locale e Locale.setDefault(Locale.US)
    }

    public static void scannerando4(){
        Scanner sc = new Scanner(System.in);

        char x;
        System.out.println("Digite um char: ");
        x = sc.next().charAt(0);
        System.out.println("Você digitou:" + x);
        sc.close(); //É preciso se atentar com a ASCI, por causa do .e , - Pode usar a Java.Util.Locale e Locale.setDefault(Locale.US)
    }

    public static void scannerando5(){
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;


        System.out.println("Digite um nome: ");
        x = sc.next();
        System.out.println("Digite um número: ");
        y = sc.nextInt();
        System.out.println("Digite um número com vírgula: ");
        z = sc.nextDouble();
        System.out.println("Você digitou o nome: " + x);
        System.out.println("Você digitou o número: " + y);
        System.out.println("Você digitou o número com vírgula: " + z);
        sc.close(); //É preciso se atentar com a ASCI, por causa do .e , - Pode usar a Java.Util.Locale e Locale.setDefault(Locale.US)
    }

    public static void scannerando6(){
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Você digitou:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }


    public static void scannerando7(){
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // Serve de buffer para capturar o enter da variavel X que nem no C, senão o nextline vai consumir o entrer e vai quebrar o código
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Você digitou:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }


    

}