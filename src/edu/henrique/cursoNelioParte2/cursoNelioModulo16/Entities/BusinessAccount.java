package edu.henrique.cursoNelioParte2.cursoNelioModulo16.Entities;

// Public - Accessible in the entire module
// Protected - Accessible in the same package, in different classes, and can be accessed in a different package, as subclass(heritage)
// Direct method (Without declaration) - Only accessible in the same package, but can be accessed by a different class
// Private - Only accessible in his own class

//Heritage is about class, not objects. The objects will have all features os all super classes.

public class BusinessAccount extends Account {  //Extends, tem todos os dados e comportamentos de Account
    private Double loanLimit;

    public BusinessAccount(){ // Construtor padrão
        super();
    }

    public BusinessAccount(Integer number, Double balance, String holder, Double loanLimit) {
        super(number, balance, holder); // Super é a classe "ACIMA", a classe que gerou a herança.
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
       if(amount <= loanLimit){
           balance += amount - 10.0; //Balance in Account is protected. Even if they are in different packages, the protected status will garantee my access because BusinessAccount is a subclass of Account.
       }
    }


}
