package edu.henrique.aModuloTreino2;

public class SmartTV {
    boolean statusEnergia =false;
    int canal = 1;
    int volume =25;


    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void diminuircanal(){
        canal--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void ligar(){
        statusEnergia =true;
    }

    public void mudarCanal (int novoCanal){
        canal =novoCanal;
    }
}