package edu.henrique.cursoNelioParte2.cursoNelioModulo19.Entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;


    // Simple constructor
   public OutsourcedEmployee(){
       super();
   }
    // Constructor
    public OutsourcedEmployee(String name, Integer hours, Double valeuPerHour, Double additionalCharge) {
        super(name, hours, valeuPerHour);
        this.additionalCharge = additionalCharge;
    }

    // Getters and Setters

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}


