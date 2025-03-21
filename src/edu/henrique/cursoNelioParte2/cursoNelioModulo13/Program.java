package edu.henrique.cursoNelioParte2.cursoNelioModulo13;

import java.util.Date;

public class Program {
    public static void application() {

     Order order = new Order (1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED; // Fazendo a conversão de ENUM para string
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //precisa ser IGUAL, camelcase

        System.out.println(os1);
        System.out.println(os2);

        /*Categorias de classes:

        Views -  Normalmente "páginas" de acesso de User
        Entities - Produtos/Clientes/Pedidos
        Repositories - Dados de banco de dados e afins
        Services - API's e afins
        Controllers - Cara que faz o meio de campo entre a tela e o sistema
         */

        // Composição de objs - UML com a relação entre os objetos

    }
}
