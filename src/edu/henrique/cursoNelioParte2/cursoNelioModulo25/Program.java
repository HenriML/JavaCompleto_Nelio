package edu.henrique.cursoNelioParte2.cursoNelioModulo25;

/*
mvc - Model View Controller
MODEL----|
         |-----ENTITIES - Entidades do negócio - Produto, clientes, pedido...
         |-----ENUMS - Enumerações - status de pedido
         |-----EXCEPTIONS - Exceções ou problemas - PedidoNaoEncontradoException
         |-----REPOSITORIES (Opcional, se houver uso de persistência): Interface para acesso ao banco de dados, por exemplo, ProdutoRepository.
         |-----SERVICES - Serviços de sistema - chamada de API, por exemplo

 */

import edu.henrique.cursoNelioParte2.cursoNelioModulo25.model.entities.CarRental;
import edu.henrique.cursoNelioParte2.cursoNelioModulo25.model.entities.Reservation;
import edu.henrique.cursoNelioParte2.cursoNelioModulo25.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void application() throws DomainException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try  {
            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("CheckIn date: ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("CheckOut date: ");
            Date checkOut = sdf.parse(sc.next());


            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();

            System.out.println("Enter data to update the reservation: ");
            System.out.println("CheckIn date: ");
            checkIn = sdf.parse(sc.next());
            System.out.println("CheckOut date: ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch(ParseException e) {
            System.out.println("Invalid Date Format");
        }
        catch(DomainException e) { // Usando aquele throw new IllegalArgument instanciado, eu uso o catch para gerar uma erro padronizado
            System.out.println("Error in reservation" + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected Error!");
            System.out.println("Try again, please!");
        }



        sc.close();
    }
}