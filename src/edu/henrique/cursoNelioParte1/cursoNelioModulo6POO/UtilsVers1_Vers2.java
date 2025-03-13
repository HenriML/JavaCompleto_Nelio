package edu.henrique.cursoNelioParte1.cursoNelioModulo6POO;
// Essas versões mostram a diferença entre o static, onde não é necessário instanciar o obj e instanciando
public class UtilsVers1_Vers2 {
    public static class Calculator {
        public static final double PI = 3.14159; //Constante - Final indica ser constante, além do que constantes semrpe são maiúsculo

        public static double circunference(double radius) {
            return 2 * PI * radius;
        }

        public static double volume(double radius) {
            return 4 * PI * radius * radius * radius / 3;
        }
    }
}