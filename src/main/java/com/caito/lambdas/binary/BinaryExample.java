package com.caito.lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryExample {
    public static void main(String[] args) {
        /**
         * BinaryOperator
         * recibe dos parametros del mismo tipo y devuelve un valor del mismo tipo
         */
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(2, 3));
    }
}
