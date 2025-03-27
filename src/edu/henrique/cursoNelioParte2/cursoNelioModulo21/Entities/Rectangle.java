package edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities;

import edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities.Enums.Color;

public class Rectangle  extends Shape{
    private Double width;
    private Double height;

    //Simple constructor
    public Rectangle(){
        super();
    }

    //Constructor
    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    //Getters and Setters


    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    //Methods
    @Override
    public double area() {
        return width * height;
    }
}
