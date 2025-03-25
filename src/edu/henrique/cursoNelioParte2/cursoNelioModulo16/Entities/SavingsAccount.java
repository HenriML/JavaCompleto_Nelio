package edu.henrique.cursoNelioParte2.cursoNelioModulo16.Entities;

public class SavingsAccount extends Account {
    private Double interestRate;


    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, Double balance, String holder, Double interestRate) {
        super(number, balance, holder);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }
}
