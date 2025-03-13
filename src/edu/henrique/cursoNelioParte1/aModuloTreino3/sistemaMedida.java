package edu.henrique.cursoNelioParte1.aModuloTreino3;

import java.util.Scanner;

public class sistemaMedida {

    public static void main(String[] args) {
        String sigla;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu tamanho: ");
        sigla = scanner.nextLine();


        switch ( sigla ) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");

        }
    }}