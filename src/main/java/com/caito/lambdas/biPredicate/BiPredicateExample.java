package com.caito.lambdas.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        /**
         * BiPredicate
         * recibe dos parametros y devuelve un boolean
         */
        BiPredicate<Integer, Integer> biPredicate = (value1, value2) -> value1 > value2;
        System.out.println(biPredicate.test(5, 3));
    }
}
