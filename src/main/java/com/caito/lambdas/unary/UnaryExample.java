package com.caito.lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryExample {
    public static void main(String[] args) {
        /**
         * UnaryOperator
         * recibe un parametro y devuelve un valor del mismo tipo
         */
        UnaryOperator<Integer> unaryOperator = a -> a * 2;
        System.out.println(unaryOperator.apply(2));
    }
}
