package org.sajourney.JavaLessons.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        //Stream
        //sequence of elements from a data source(collection, array or other input source)
        int[] numbers = {0,2,5,1,7,4,3};

        Arrays.stream(numbers)
                .forEach(n-> System.out.print(n+1+" "));

        List<String> veggies = List.of(
                "spinach",
                "cabbage",
                "peas",
                "green beans",
                "brussels sprouts",
                "carrots");

        boolean isPeas = veggies.stream().anyMatch(v->v.contains("peas"));
        System.out.println(isPeas);

       veggies.stream()
               .map(String::toUpperCase)
               .forEach(System.out::println);

       List<Integer> number = List.of(0,2,5,1,7,4,3);

       int num = number.stream().reduce(0, (a,b) -> a+b);
        System.out.println(num);


    }
}
