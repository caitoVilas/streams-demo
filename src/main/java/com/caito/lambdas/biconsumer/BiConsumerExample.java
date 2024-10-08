package com.caito.lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /**
         * BiConsumer
         * recibe dos valores y no devuelve nada
         */
        BiConsumer<String, String> biConsumer = (x, y) -> System.out.println(x + " " + y);
        biConsumer.accept("Hello", "world!");
    }
}
