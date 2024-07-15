package org.sajourney.JavaLessons.datastructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("Have lemon?" + fruits.contains("lemon"));
        fruits.remove("apple");
        System.out.println("No of elements" + fruits.size());

        Set moreFruit = Set.of("pear","raisin","cherry");//immutable
        moreFruit.add("cranberry");
        moreFruit.remove("pear");
        System.out.println(moreFruit);



    }
}
