package org.sajourney.JavaLessons.datastructures;

import java.util.HashSet;
import java.util.Set;

public class Iterators {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("apple");

        var i = fruits.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        //Enhanced for loops
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
