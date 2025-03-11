package edu.henrique.cursoNelioModulo8POOEncapExec;

/*

Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void application() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account; // Declaração da variável `account` para armazenar a instância da classe `Account`.



        System.out.print("Welcome to the bankRupcy!\n ");
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt(); //Declaro essa var de forma auxiliar para captar o valor do user e inserir na var da account
        System.out.print("Enter account name: ");
        sc.nextLine(); //                                              ||
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0); //Declaro essa para validar se há depósito ou não deposito inicial
        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double InitialDeposit = sc.nextDouble(); // Mesma ideia de captar o valor com uma var auxiliar de mesmo nome, afinal só account foi declarada, e não as var dentro dela
            account = new Account(accountNumber, accountHolder, InitialDeposit); //Caso positivo, inicio com três parâmetros, sendo um deles o valor capturado do user
        }else {
            account = new Account(accountNumber, accountHolder);// Caso negativo, só instancio com dois, deixando o valor padrão de 0 para InitialDeposit
        }
        System.out.println();

        System.out.println();
        System.out.println("Account data: \n");
        System.out.println(account); // Exibe os dados da conta usando o método `toString` da classe `Account`.



        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble(); //Coleto o valor com a var auxiliar do depósito
        account.deposit(depositValue); // Jogo dentro da var constante account o valor coletado em depositValue como parãmetro, usando a função deposit que com as vars auxiliares, coletaram o deposit, jogaram o valor em amount e somaram com o initialDeposit
        System.out.print("Updated account data: ");
        System.out.println(account); // Mostro o valor atualizado

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double withdrawValue = sc.nextDouble(); //Tal qual acima, porém com o valor invertido, retirando da conta
        account.withdraw(withdrawValue); //Mesmo processo acima, porém com sinal invertido de retirada + acrécimo de 5 negativo da "taxa bancária"
        System.out.print("Updated account data: ");
        System.out.println(account); // Mostro o valor atualizado



        sc.close();// Finalizo o código
    }
}