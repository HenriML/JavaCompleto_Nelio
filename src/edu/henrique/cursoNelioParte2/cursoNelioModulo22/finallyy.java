package edu.henrique.cursoNelioParte2.cursoNelioModulo22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class finallyy {
    public static void application(){

            File file = new File("C:\\temp\\in.txt");
            Scanner sc = null;
            try {
               sc = new Scanner(file);
               while(sc.hasNextLine()){
                   System.out.println(sc.nextLine());
               }
            }
            catch (FileNotFoundException e) {
                System.out.println("Error opening file: " + e.getMessage());
            }
            finally{
                if(sc != null){
                    sc.close();
                }
                System.out.println("Finally block executed!");
            }
        }
    }
