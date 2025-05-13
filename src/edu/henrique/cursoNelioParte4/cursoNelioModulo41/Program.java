package edu.henrique.cursoNelioParte4.cursoNelioModulo41;


// Comparator serve para ordenar, por exempo comparando preço, ou nome em alfabética e usando o ToUpper para rodar.
// Expressão LAMBDA - A ideia é simplicidar e diminuir verbosidade, com "expressão anonima)

/* Interface funcional é: Uma interface que possui um único métoodo abstrato. Assim, dá para instanciar uma classe, implementando essa interface e passando um métoodo dentro dela, assim para usar, instanciando um objeto dentro do parâmetro, exemplo:


public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2){
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }

    list.sort(new MyComparator());
*/
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

