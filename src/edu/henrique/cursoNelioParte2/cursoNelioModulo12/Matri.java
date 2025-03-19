package edu.henrique.cursoNelioParte2.cursoNelioModulo12;

import java.util.Scanner;

public class Matri {
    public static void application() {


        Scanner sc = new Scanner(System.in);


        System.out.println("Digite os números: ");
        int n = sc.nextInt();
        int [][] mat = new int[n][n];  //Arranjo Bi dimensional. Caso fosse matriz quadrática, ou seja, com profundidade seriam três[]

        for(int i=0; i<n; i++){  // A variável i vai servir para passar por todas as linhas, indo no sentido vertical após o final da j
            for (int j=0; j<n; j++){ // A J, cuidará do preenchimento de todas as colunas, o sistema lerá  0 - 0; 0 - 1; 0 - 2 daí acaba e volta para i, o for acima, que incrementará i em 1, e joga para j de novo fazer 1 - 0; 1 - 1; 1 - 2... e assim vai.
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(mat[i][i]+"");
        }

        int count = 0;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(mat [i] [j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers are: " + count);


        sc.close();
    }
}
