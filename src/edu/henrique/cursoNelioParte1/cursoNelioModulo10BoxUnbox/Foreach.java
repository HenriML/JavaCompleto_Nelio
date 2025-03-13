package edu.henrique.cursoNelioParte1.cursoNelioModulo10BoxUnbox;

public class Foreach {
    public static void application() {

        String vect [] = new String[]{"Maria","Bob","Alex"};


        for(int i=0; i<vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("-----------------------------");
        //Foreach
        for(String list : vect){
            System.out.println(list);
        }
    }
}
