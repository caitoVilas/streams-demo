package com.caito.lambdas.consumer;

import java.util.function.Consumer;

public class Consumerxample {
    public static void main(String[] args) {
        /**
         * Consumer
         * recibe un valor y no devuelve nada
         */
        Consumer<String> consumer = System.out::println; // (x) -> System.out.println(x);
        consumer.accept("Hello world!");
    }
}
