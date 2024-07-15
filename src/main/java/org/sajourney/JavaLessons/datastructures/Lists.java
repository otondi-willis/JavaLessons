package org.sajourney.JavaLessons.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        //implementations of lists arraylist, linkedlist, stack and vector

        List fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.remove(4);

        fruits.set(2,"grape");

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println("index of first lemon: " + fruits.indexOf("lemon"));
        System.out.println("index of first lemon: " + fruits.lastIndexOf("lemon"));

        List moreFruit = List.of("cherry", "cranberry","plum");

    }
}
