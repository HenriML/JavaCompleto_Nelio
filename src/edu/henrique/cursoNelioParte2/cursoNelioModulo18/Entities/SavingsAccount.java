package edu.henrique.cursoNelioParte2.cursoNelioModulo18.Entities;

public class SavingsAccount extends Account { // AO USAR FINAL, EU GARANTO QUE NÃO TERÁ SUBCLASSE DA SavingsAccount
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

    // O Override procura o métodoo e garante que ele existe no super. Caso não, acusa erro.
    @Override // Sobreposição - Ou seja, estou usando o métodoo da classe super(Account) que é o withdraw, mas estou trocando o pneu com o carro andando, pois consigo alterar as regras por estar em uma classe diferente, e uso o @ Override para indicar isso.
    public final void withdraw(double amount){ // Como o métodoo está usando FINAL, também não deixa outro override/sobreposição dele
        balance -= amount; // Geralmente Override já tem um final para evitar muitos override a gargalo, tanto em classe tbm
    }


}
