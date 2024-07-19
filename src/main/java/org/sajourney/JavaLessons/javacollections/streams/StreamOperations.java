package org.sajourney.JavaLessons.javacollections.streams;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        //Highlight of imperative coding style
        Room cambridge = new Room("Cambridge","Premier",6,175.00);
        Room piccadilly = new Room("Picaddilly","Guest Room",3,125.00);
        Room westminister = new Room("Westminister","Premier Room",4,200.00);
        Room victoria = new Room("Victoria","Suite",5,225.00);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly,cambridge,westminister,victoria));
        piccadilly.setPetFriendly(true);
        victoria.setPetFriendly(true);

        Collection<Room> petFriendlyRooms = rooms.stream() //invokation to start the pipeline
                .filter(Room::isPetFriendly)
                .collect(Collectors.toList());//terminal operation(return a result or modify elements that are streamed into it)

        //passing in external object and modifying it within a stream
        //should never use both
        petFriendlyRooms.stream()
                .map(r->r.getName())
                .forEach(System.out::println);




    }
}
