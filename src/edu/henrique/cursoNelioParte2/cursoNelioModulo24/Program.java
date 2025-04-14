package edu.henrique.cursoNelioParte2.cursoNelioModulo24;

/*
mvc - Model View Controller
MODEL----|
         |-----ENTITIES - Entidades do negócio - Produto, clientes, pedido...
         |-----ENUMS - Enumerações - status de pedido
         |-----EXCEPTIONS - Exceções ou problemas - PedidoNaoEncontradoException
         |-----REPOSITORIES (Opcional, se houver uso de persistência): Interface para acesso ao banco de dados, por exemplo, ProdutoRepository.
         |-----SERVICES - Serviços de sistema - chamada de API, por exemplo

 */

import edu.henrique.cursoNelioParte2.cursoNelioModulo24.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void application() throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("CheckIn date: ");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("CheckOut date: ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();

            System.out.println("Enter data to update the reservation: ");
            System.out.println("CheckIn date: ");
            checkIn = sdf.parse(sc.next());
            System.out.println("CheckOut date: ");
            checkOut = sdf.parse(sc.next());

            String error = reservation.updateDates(checkIn, checkOut);
            if(error != null){
                System.out.println("Error in reservation " + error);
            }
            else{
                System.out.println("Reservation: " + reservation);
            }
        }
            sc.close();
    }

}