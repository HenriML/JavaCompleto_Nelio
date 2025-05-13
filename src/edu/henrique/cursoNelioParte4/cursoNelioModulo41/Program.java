package edu.henrique.cursoNelioParte4.cursoNelioModulo41;


// Comparator serve para ordenar, por exempo comparando preço, ou nome em alfabética e usando o ToUpper para rodar.
// Expressão LAMBDA - A ideia é simplicidar e diminuir verbosidade, com "expressão anonima)
import java.util.Arrays;

public class Program {

    public static int globalValue = 10; //O comportamento da função, depende do valor inserido FORA do escopo, como é nessa var chamada global Value, ou seja, sem TRANSPARÊNCIA REFERENCIAL

    public static void main(String[] args) {
        int[] vect = new int[] { 3, 4, 5 };
        changeOddValue(vect);
        System.out.println(Arrays.toString(vect));
    }

    public static void changeOddValue(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue; // Corrigido de `=+` para `+=`
            }
        }
    }
}

