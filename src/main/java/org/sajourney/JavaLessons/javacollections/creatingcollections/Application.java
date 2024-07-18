package org.sajourney.JavaLessons.javacollections.creatingcollections;

import java.util.Collection;
import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        Collection<String> c = new HashSet<>();
        c.add("snowboard");
        c.add("linux");
        c.add("books");
        c.add("snowboard");

        System.out.println(c);


    }
}
