package edu.henrique.cursoNelioParte2.cursoNelioModulo18;

import edu.henrique.cursoNelioParte2.cursoNelioModulo18.Entities.Account;
import edu.henrique.cursoNelioParte2.cursoNelioModulo18.Entities.SavingsAccount;


public class Program {
    public static void application(){

        Account x = new Account(1020, 1000.0,"Alex");
        Account y = new SavingsAccount(1023, 1000.0,"Maria",0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println("---/---");
        System.out.println(y.getBalance());


        // Polimorfismo - Chamou a mesma operação, em variáveis do mesmo tipo (Account) porém tiveram
        //comportamentos diferentes devido Account e Savings account
    }
}
