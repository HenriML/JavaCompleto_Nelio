package edu.henrique.cursoNelioParte4.cursoNelioModulo40.entities;

public class Product {

    private String name;
    private Double price;

//  Construtor padrão
    public Product(){
    }

// Constructor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

//  Getters & Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

// ToString

    @Override
    public String toString() {
        return "Product [name = " + name + "Price: " + price + "]";
    }
/*
    @Override
    public int compareTo(Product p) {
        return name.toUpperCase().compareTo(p.getName().toUpperCase());
    }

 */

}
