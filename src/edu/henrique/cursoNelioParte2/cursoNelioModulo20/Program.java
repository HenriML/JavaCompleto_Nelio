package edu.henrique.cursoNelioParte2.cursoNelioModulo20;

import edu.henrique.cursoNelioParte2.cursoNelioModulo20.Entities.Account;
import edu.henrique.cursoNelioParte2.cursoNelioModulo20.Entities.BusinessAccount;
import edu.henrique.cursoNelioParte2.cursoNelioModulo20.Entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void application(){

        //Account acc1 = new Account(1001, 1000.0,"Alex"); // A classe está como abstrata, ou seja, não pode ser instanciada.
        Account acc2 = new SavingsAccount(1002, 1000.0,"Maria", 0.01);
        Account acc3 = new BusinessAccount(1003, 1000.0,"Bob", 500.0);


        //Mas pq ter uma classe que não pode ser instanciada?
        //Pois assim ele serve de base, nesse caso por exemplo, de base polimórfica para todas as outras contas
        // Polimorfismo - Chamou a mesma operação, em variáveis do mesmo tipo (Account) porém tiveram
        //comportamentos diferentes devido Account e Savings account

        //PS: Na UML, uma classe ou métodoo abstrato fica em itálico
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, 500.0,"Alex", 0.01));
        list.add(new BusinessAccount(1002, 1000.0,"Maria", 400.0));
        list.add(new SavingsAccount(1003, 300.0,"Bob", 0.01));
        list.add(new BusinessAccount(1005, 500.0,"Ana", 500.0));



        double sum = 0.0;
        for(Account acc : list){
            sum += acc.getBalance();
        }
        System.out.println("Total in accounts: " + sum);

        for(Account acc : list) {
            acc.deposit(10.0);
        }
        for(Account acc : list){
            System.out.println("Updated balance: " + acc.getNumber() +" - " + acc.getBalance());
        }
    }
}
