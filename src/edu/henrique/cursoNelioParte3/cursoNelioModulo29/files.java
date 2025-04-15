package edu.henrique.cursoNelioParte3.cursoNelioModulo29;

import java.io.File;
import java.util.Scanner;

public class files {
    public static void applicationFile() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strpath = sc.nextLine();

        File path = new File (strpath);

        File[] folders = path.listFiles(File::isDirectory); //Cria um vetor de files contendo as pastas
        System.out.println("FOLDERS: ");
        for(File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); //Cria um vetor de files contendo as pastas
        System.out.println("FILES: ");
        for(File file : files) {
            System.out.println(files);
        }

        boolean success = new File(strpath + "\\subdir").mkdir();
        System.out.println("Directory created sucessfully:" + success);

       sc.close();
    }
}
