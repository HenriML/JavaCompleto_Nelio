package edu.henrique.cursoNelioParte3.cursoNelioModulo29;

import java.io.*;

public class Program {
    public static void application() {

        String [] lines = new String[] {"Good morning","Good afternoon","Good night"};

            String path = "c:\\temp\\out.txt";

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // Eu posso adicionar um parametro true depois do path, assim ele não recria e só vai adicionando o arquivo
                for(String line : lines) {
                    bw.write(line);
                    bw.newLine();
                }

            }
            catch(IOException e){
                e.printStackTrace();

            }
        }
    }

