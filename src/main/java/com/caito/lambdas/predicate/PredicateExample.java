package com.caito.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /**
         * Predicate
         * recibe un parametro y devuelve un boolean
         */
        Predicate<String> predicate = (value) -> value.length() > 5;
        System.out.println(predicate.test("Hello World"));
    }
}
