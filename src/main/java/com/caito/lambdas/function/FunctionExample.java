package com.caito.lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /**
         * Function
         * recibe un parametro y devuelve un valor
         */
        Function<Integer, String> function = (x) -> "Result: " + x;
        System.out.println(function.apply(10));
    }
}
