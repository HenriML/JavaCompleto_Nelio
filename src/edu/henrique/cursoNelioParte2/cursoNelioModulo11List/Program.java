package edu.henrique.cursoNelioParte2.cursoNelioModulo11List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void application(){
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");
        list.remove(3); // Ou list.remove("Anna");(Ele entende por comparação)  Ou list.removeIf( x -> x.charAt(0 == "M"); ( Essa resposta aqui vai usar um IF para analisar todos os nomes da lista, e caso eles tenham o char inicial como M, ele tira)
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Aqui ele vai gerar uma lista que vai coletar somente os nomes com A, e armazena essa lista no results. Dá para usar o findFirst().orelse(null);
        // Dá para manipular toda a lista.

        System.out.println("Index of Bob: " + list.indexOf("Bob")); // Quando não encontra o elemento, dá -1


        for(String x : list){
            System.out.println(x);
        }

    }


}
