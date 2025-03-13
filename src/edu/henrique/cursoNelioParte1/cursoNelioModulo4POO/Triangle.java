package edu.henrique.cursoNelioParte1.cursoNelioModulo4POO;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area(){ //COMO RETORNA ALGO, NÃO PODE SER "VOID" - Public static VOID e sim Double
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
