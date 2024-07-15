package org.sajourney.JavaLessons.functionalprogramming;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
        //Functional Interface
        //interface with just one abstract method that can be implemented by lambda
        //expressions and method references
        //lambda expressions is an implementation of Consumer Functional interface
        List countries = List.of("Australia","China","France","Italy");
        Consumer print = c -> System.out.println(c);
        countries.forEach(print);

        Function<Integer, Integer> square = (n) -> n*n;
        Function<Integer, Integer> add = (n) -> n+n;

        int num = square.andThen(add).apply(5);
        System.out.println(num);
    }
}
