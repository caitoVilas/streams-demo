package com.caito.lambdas.biFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /**
         * BiFunction
         * recibe dos parametros y devuelve un valor
         */
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum; // (a, b) -> a + b;
        System.out.println(biFunction.apply(2, 3));
    }
}
