package com.caito.streams;

import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        // Streams
        // Secuencia de elementos que soporta operaciones secuenciales y paralelas
        // Operaciones intermedias: filter, map, limit, sorted, distinct
        // Operaciones terminales: forEach, collect, reduce, count, anyMatch, allMatch, noneMatch, findFirst, findAny
        // forEach: recorre los elementos de la secuencia -> consumer
        // filter: filtra los elementos de la secuencia -> predicate
        // map: transforma los elementos de la secuencia -> function
        // reduce: combina los elementos de la secuencia -> binary operator
        // collect: transforma los elementos de la secuencia en una coleccion
        // distinct: elimina los elementos duplicados
        // limit: limita la cantidad de elementos de la secuencia
        // skip: salta los primeros n elementos de la secuencia
        // anyMatch: devuelve true si algun elemento de la secuencia cumple con el predicado -> predicate
        // allMatch: devuelve true si todos los elementos de la secuencia cumplen con el predicado -> predicate
        // noneMatch: devuelve true si ningun elemento de la secuencia cumple con el predicado -> predicate


        List<String> names = List.of("Caito", "Rosana", "Tamara", "Martin");

        names.stream()
            .forEach(System.out::println);
        System.out.println("----------");
        names.stream()
            .filter(name -> name.startsWith("C"))
            .forEach(System.out::println);
        System.out.println("----------");
        names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
        System.out.println("----------");
        names.stream()
            .map(String::toUpperCase)
            .filter(name -> name.startsWith("C"))
            .forEach(System.out::println);
        System.out.println("----------");
        names.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("----------");
        String result = names.stream()
                .reduce("",(a, b) -> a + " - " + b);
        System.out.println(result);
        System.out.println("----------");
        List<String> names2 = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(names2);
        System.out.println("----------");
        List<String> list = List.of("Caito", "Caito", "Caito", "Martin");
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("----------");
        names.stream()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("----------");
        names.stream()
                .skip(2)
                .forEach(System.out::println);
        System.out.println("----------");
        boolean anyMatch = names.stream()
                .anyMatch(name -> name.startsWith("C"));
        System.out.println(anyMatch);
        System.out.println("----------");
        boolean allMatch = names.stream()
                .allMatch(name -> name.startsWith("C"));
        System.out.println(allMatch);
        System.out.println("----------");
        boolean noneMatch = names.stream()
                .noneMatch(name -> name.startsWith("W"));
        System.out.println(noneMatch);
    }
}
