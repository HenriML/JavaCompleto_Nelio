package edu.henrique.cursoNelioModulo8POOEncapExec;

public class Account {

    private int Accountnumber;
    private String Accountname;
    private double InitialDeposit;

//-------------------------------------------------------------------------------Constructors

    public Account(int number, String name) {
        this.Accountnumber = number;
        this.Accountname = name;
        this.InitialDeposit = InitialDeposit;
    }

    public Account(int number, String name, double initialDeposit) {
        this.Accountnumber = number;
        this.Accountname = name;
        deposit(initialDeposit);
    }


//-------------------------------------------------------------------------------Getters and setters

    public int getNumber() {
        return Accountnumber;
    }

    public String getName() {
        return Accountname;
    }

    public void setName(String name) {
        this.Accountname = name;
    }

    public double getBalance() {
        return InitialDeposit;
    }
//-------------------------------------------------------------------------------Functions

    public void deposit(double amount) {
        InitialDeposit += amount;
    }

    public void withdraw(double amount) {
        InitialDeposit -= amount + 5.0;
    }

    public String toString(){
        return "Account number: " + Accountnumber +"\nName:" + Accountname + "\nBalance: " + InitialDeposit;
    }
}

