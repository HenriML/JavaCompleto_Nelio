package edu.henrique.cursoNelioParte4.cursoNelioModulo42.util;

import edu.henrique.cursoNelioParte4.cursoNelioModulo40.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return false;
    }
}
