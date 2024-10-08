package com.caito.lambdas.runnable;

public class RunnableExample {
    public static void main(String[] args) {
        /**
         * Runnable
         * no recibe ningun parametro y no devuelve ningun valor solo ejecuta una tarea
         */
        Runnable runnable = () -> System.out.println("tarea dentro de runnable");
        runnable.run();
    }
}
