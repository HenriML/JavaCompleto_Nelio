package edu.henrique.cursoNelioParte1.cursoNelioModulo5POOExec;

public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;
    public double UpdateGrossSalary;


    public String toString() {
    return name + ", $ " + GrossSalary;
    }

    public double IncreaseSalary(int percentage){
        return UpdateGrossSalary += (GrossSalary * percentage / 100.0);
    }

    public double NetSalary(){
        return UpdateGrossSalary = GrossSalary - Tax;
    }

}
