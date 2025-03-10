package edu.henrique.cursoNelioModulo8POOEncap;

public class Product {

    private String name;
    private double price;
    private int quantity;

    // Construtor - Executado na instanciação do obj

    // USAR O THIS é necessário pois ele indica, nesse caso que o primeiro name, o this.name é do objeto product, e não a variável local, assim podendo passar o valor da var local para o produto
    //----------------------------------------------------------------Constructors
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Uma sobrecarga de constructor, mostrando que é possível.
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //----------------------------------------------------------------Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //----------------------------------------------------------------Functions
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

