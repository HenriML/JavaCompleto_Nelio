package edu.henrique.cursoNelioParte1.aModuloTreino3;

public class caixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 6.0;

        if(valorSolicitado < saldo && valorSolicitado > 5)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
}