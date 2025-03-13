package edu.henrique.cursoNelioParte1.cursoNelioModulo5POO;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity ;
    }

   public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                +", "
                +quantity
                + " units, Total: $ "
                + String.format("%.2f", TotalValueInStock());
    }


    }

