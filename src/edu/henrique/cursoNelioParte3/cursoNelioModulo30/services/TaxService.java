package edu.henrique.cursoNelioParte3.cursoNelioModulo30.services;

public interface TaxService {
    double tax(double amount);

// É uma classe que terá subtipos, e BrazilTaxService é um deles, entao funciona
// normalmente declarando TaxServices, e não Brazil, limitando-a
}
