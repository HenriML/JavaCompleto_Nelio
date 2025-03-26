package edu.henrique.cursoNelioParte2.cursoNelioModulo17;

import edu.henrique.cursoNelioParte2.cursoNelioModulo17.Entities.Account;
import edu.henrique.cursoNelioParte2.cursoNelioModulo17.Entities.Account.*;
import edu.henrique.cursoNelioParte2.cursoNelioModulo17.Entities.BusinessAccount;
import edu.henrique.cursoNelioParte2.cursoNelioModulo17.Entities.SavingsAccount;

/*

Upcasting - Casting da sub para a super classe - BusinessAccount tem um objeto, e quisesse atribuir a uma variável do tipo Account - Uso comum: Polimorfismo

Downcasting - Casting da super para a subclasse - Account tem um objeto, e quisesse atribuir a uma variável do tipo BusinessAccount - Uso comum: Método que recebe parâmrtro genérico - Equals
 */
public class Program {
    public static void application() {

        Account acc1 = new Account(1001, 1000.0, "Alex");
        Account acc2 = new SavingsAccount(1002, 1000.0, "Maria", 0.01);
        Account acc3 = new BusinessAccount(1003, 1000.0, "Bob", 500.0);

        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
        // Withdraw do super, com a taxa de 5 dinheiros (795.0)

        System.out.println("------------//------------");
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
        // Upcasting usando Account como SavingAccount, porém daí usa o withdraw do Saving, sem a taxa de 5 dinheiros. (800.0)

        System.out.println("------------//------------");
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
        // Upcasting do Account como BusinessAccount, usando o withdraw do super na implementação, ou seja, usando as regras do super + regras aplicadas no business como -2.0 dinheiros (793.0)




    }
}