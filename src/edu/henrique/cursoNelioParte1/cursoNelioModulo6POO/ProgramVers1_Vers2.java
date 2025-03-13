package edu.henrique.cursoNelioParte1.cursoNelioModulo6POO;
// Essas versões mostram a diferença entre o static, onde não é necessário instanciar o obj e instanciando
import java.util.Locale;
import java.util.Scanner;

// Membros == atributos e métodos
//O método é chadado de acordo com a instância - Tipo chamar o método "área" para cada intância "Triangulo" assim fazendo o cálculo de ambos com o mesmo método
// Classes utilitárias de membros estáticos, a Math.sqrt por exemplo
//Uma classe que possui somente membros estáticos não pode ser instanciada
//A Marina Simões Vieira é o amorzinho da minha vida!!! <3

public class ProgramVers1_Vers2 {
    public static void application() {

        UtilsVers1_Vers2.Calculator calc = new UtilsVers1_Vers2.Calculator();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();


        double c = UtilsVers1_Vers2.Calculator.circunference(radius);
        double v = UtilsVers1_Vers2.Calculator.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", UtilsVers1_Vers2.Calculator.PI);

        sc.close();
    }
}


/*


Resumo: static é útil para definir membros que devem ser compartilhados por todas as instâncias ou acessíveis sem instanciar a classe,
Ou seja, ao declarar  funções com métodos e afins, se ele for estático eu não preciso instanciar objeto para essa função.
 */