package edu.henrique.cursoNelioParte1.cursoNelioModulo8POOEncapExec;

public class Account {

    private int Accountnumber;
    private String Accountname;
    private double InitialDeposit;
    // Variáveis privadas para garantir o encapsulamento, permitindo acesso e modificação apenas por meio de métodos públicos (getters e setters).
//-------------------------------------------------------------------------------Constructors

    public Account(int number, String name) {
        this.Accountnumber = number;
        this.Accountname = name;
        this.InitialDeposit = 0.0;
    } // Construtor que inicializa a conta sem depósito inicial, assumindo que o saldo será 0.

    public Account(int number, String name, double initialDeposit) {
        this.Accountnumber = number;
        this.Accountname = name;
        deposit(initialDeposit);
    } // Construtor sobrecarregado que inicializa a conta com um depósito inicial fornecido pelo usuário.
      // O método deposit é chamado para garantir que qualquer lógica adicional seja aplicada corretamente ao saldo.



//-------------------------------------------------------------------------------Getters and setters

    public int getNumber() {
        return Accountnumber;
    } // Get Number para fazer a coleta de dados do usuário via input no scanner

    public String getName() {
        return Accountname;
    } // Get Name para fazer a coleta de dados do usuário via input no scanner

    public void setName(String name) {
        this.Accountname = name;
    } // Set Name para fazer a alteração de dados do usuário via input no scanner - Usado para alterar o nome do cliente, bastando apenas a implementação da função, e não fou usado no código

    public double getBalance() {
        return InitialDeposit;
    }// Retorna o saldo da conta. O saldo só pode ser modificado por meio dos métodos `deposit` e `withdraw`.
//-------------------------------------------------------------------------------Functions

    public void deposit(double amount) {
        InitialDeposit += amount;
    } // Deposit, uma função para colocar mais dinheiro na conta do usuário, usado posteriormente da declaração e coleta de dados

    public void withdraw(double amount) {
        InitialDeposit -= amount + 5.0;
    } // Withdraw, uma função para retirar dinheiro na conta do usuário, usado posteriormente da declaração e coleta de dados

    public String toString(){
        return "Account number: " + Accountnumber +"\nName:" + Accountname + "\nBalance: " + InitialDeposit;
    } //Usado para formatar a saída, para que sejam displayados corretamente
}

