package org.sajourney.JavaLessons.functionalprogramming;

import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        //Stream
        //sequence of elements from a data source(collection, array or other input source)
        int[] numbers = {0,2,5,1,7,4,3};

        Arrays.stream(numbers)
                .forEach(n-> System.out.print(n+1+" "));

    }
}
