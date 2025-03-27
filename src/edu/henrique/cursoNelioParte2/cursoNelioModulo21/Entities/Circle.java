package edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities;

import edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities.Enums.Color;

public class Circle extends Shape{
    private Double radius;

    //Simple constructor
    public Circle(){
        super();
    }

    //Constructor
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    //Getters and Setters


    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
