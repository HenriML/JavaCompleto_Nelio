package edu.henrique.cursoNelioParte2.cursoNelioModulo16;

import edu.henrique.cursoNelioParte2.cursoNelioModulo16.Entities.Account;
import edu.henrique.cursoNelioParte2.cursoNelioModulo16.Entities.Account.*;
import edu.henrique.cursoNelioParte2.cursoNelioModulo16.Entities.BusinessAccount;
import edu.henrique.cursoNelioParte2.cursoNelioModulo16.Entities.SavingsAccount;

/*

Upcasting - Casting da sub para a super classe - BusinessAccount tem um objeto, e quisesse atribuir a uma variável do tipo Account - Uso comum: Polimorfismo

Downcasting - Casting da super para a subclasse - Account tem um objeto, e quisesse atribuir a uma variável do tipo BusinessAccount - Uso comum: Método que recebe parâmrtro genérico - Equals
 */
public class Program {
    public static void application() { // Dentro do método, funfa
        Account Acc = new Account(1001, 0.0, "Alex");
        BusinessAccount Bacc = new BusinessAccount(1002, 0.0, "Maria", 500.0);


        //Upcasting
        Account acc1 = Bacc;
        Account acc2 = new BusinessAccount(1003, 0.0, "Bob", 200.0);//
        Account acc3 = new SavingsAccount(1004, 0.0, "Ana", 0.01); //O tipo da acc é Account, mesmo instanciado como BusinessAccount
        //É uma operação onde você pega um objeto da Subclasse a atribui para uma superclasse

        //Downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2; // Account não tem loan, caso eu queira usar um loan na conta account, eu dou um downcasting no objeto acc2(Que poderia ser uma conta CPF) que é do tipo account para BusinessAccount, dai posso usar o loan, como no exemplo
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount)acc3; // Isso vai dar erro pq o downcasting não soube interpretar que acc3 é um SavingsAccount, e não um BusinessAccount - Só percebe em tempo de execução, e lança um: ClassCastException
        // Para contornar isso, é possivel:

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            System.out.println("Conversão bem-sucedida!");
            acc5.loan(200.0);
            System.out.println("Loan!");
        } //Ele ignora pq acc3 não é instanceOf BusinessAccount e roda o if de baixo

        //
        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}