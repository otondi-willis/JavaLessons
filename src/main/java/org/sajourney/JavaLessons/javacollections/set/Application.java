package org.sajourney.JavaLessons.javacollections.set;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge","Premier",6,175.00);
        Room piccadilly = new Room("Picaddilly","Guest Room",3,125.00);
        Room westminister = new Room("Westminister","Premier Room",4,200.00);
        Room westministerDuplicate = new Room("Westminister","Premier Room",4,200.00);

        Set<Room> rooms = new HashSet<>();
        rooms.add(piccadilly);
        rooms.add(cambridge);
        rooms.add(cambridge);
        rooms.add(westminister);
        rooms.add(westministerDuplicate);

        rooms.stream()
                .map(r -> r.getName())
                .forEach(System.out::println);
    }
}
