package org.sajourney.JavaLessons.javacollections.set;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(500,1500,2500,1000,3000,2000);

        NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

        numberTree.descendingSet().stream()
                .forEach(System.out::println);

    }
}
