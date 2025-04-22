package edu.henrique.cursoNelioParte3.cursoNelioModulo30.entities;

public class Vehicle {
    private String model;

    //Simple constructor
    public void vehicle(){
    }


    //Constructor with args
    public Vehicle(String model) {
        this.model = model;
    }


    //Getter and setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
