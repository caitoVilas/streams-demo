package com.caito.lambdas.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /**
         * Supplier
         * no recibe ningun parametro y devuelve un valor
         */
        Supplier<String> supplier = () -> "Hola Mundo";
        System.out.println(supplier.get());
    }
}
