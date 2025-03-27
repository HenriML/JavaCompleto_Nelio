package edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities;

import edu.henrique.cursoNelioParte2.cursoNelioModulo21.Entities.Enums.Color;

public abstract class Shape {
    private Color color;

    //Constructor
    public Shape(){
    }

    public Shape(Color color) {
        this.color = color;
    }

    //Gétters and Setters
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Métodos
    public abstract double  area();
    // Ela usa semicolon no final pois não vai retornar nada, afinal é abstrata.
         // Pelo fato de cada forma geométrica ter sua forma de medir área, esse méthod é muito genérico, então precisa ser abstrato, e ser apluicado nas subclasses, assim cada um tendo suas régras específicas.
        // E ao invés de ter várias classes cada uma com seu méthod, eu tenho um method só que é genérico e serve para todas


}

