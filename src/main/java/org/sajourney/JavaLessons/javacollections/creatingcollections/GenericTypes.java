package org.sajourney.JavaLessons.javacollections.creatingcollections;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.ArrayList;
import java.util.Collection;

public class GenericTypes {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("Cambridge");
        c.add(1L);
        c.stream()
                .forEach(e-> System.out.println(e.getClass()));

        Collection c2 = new ArrayList();
        c2.add(new Room("Cambridge","Suite",6,250.0));

    }
}
