package org.sajourney.JavaLessons.javacollections.creatingcollections;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.ArrayList;
import java.util.Collection;

public class GenericTypes {
    public static void main(String[] args) {
        Collection<Room> c = new ArrayList<>();//fail fast and fail early than without using Generic Typing

//        c.add("Cambridge");
//        c.add(1L);
        c.add(new Room("Cambridge","Suite",6,250.0));
        c.stream()
                .forEach(e-> System.out.println(e.getName()));

        Collection c2 = new ArrayList();
        c2.add(new Room("Cambridge","Suite",6,250.0));

    }
}
