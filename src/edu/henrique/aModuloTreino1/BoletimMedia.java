package edu.henrique.aModuloTreino1;

public class BoletimMedia {
    public static void main(String[] args) {
        int mediaFinal = 8;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Exame");
        else
            System.out.println("Aprovado");
    }
}