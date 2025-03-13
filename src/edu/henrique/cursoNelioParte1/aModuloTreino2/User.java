package edu.henrique.cursoNelioParte1.aModuloTreino2;

public class User {
    public static void main (String[] args) throws Exception {

        SmartTV SmartTV = new SmartTV();

        System.out.println("Televisão Ligada ? " + SmartTV.statusEnergia);
        System.out.println("Canal: " + SmartTV.canal);
        System.out.println("Volume: " + SmartTV.volume);


        SmartTV.ligar();
        System.out.println("Novo Status: Televisão Ligada ? " + SmartTV.statusEnergia);


        System.out.println("Alterando Canal");
        SmartTV.mudarCanal(13);
        System.out.println("Canal: " + SmartTV.canal);

    }
}