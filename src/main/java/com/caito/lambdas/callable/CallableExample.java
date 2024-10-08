package com.caito.lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /**
         * Callable
         * recibe no recibe valores pero devuelve un valor o lanza una excepcion
         */
        Callable<String> callable = () -> "Hello World en callable";
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
