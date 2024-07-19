package org.sajourney.JavaLessons.javacollections.set;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge","Premier",6,175.00);
        Room piccadilly = new Room("Picaddilly","Guest Room",3,125.00);
        Room westminister = new Room("Westminister","Premier Room",4,200.00);
        Room westministerDuplicate = new Room("Westminister","Premier Room",4,200.00);
        Room victoria = new Room("Victoria","Premier Room",4,200.00);

        Set<Room> otherRooms = Set.of(piccadilly,cambridge);//unmodifiable set
        //otherRooms.add(westministerDuplicate);

        Set<Room> rooms = new LinkedHashSet<>();
        rooms.add(piccadilly);
        rooms.add(cambridge);
        rooms.add(cambridge);
        rooms.add(westminister);
        rooms.add(westministerDuplicate);
        rooms.add(victoria);

        Set<Room> moreRooms = Set.copyOf(rooms);

        moreRooms.stream()
                .map(r -> r.getName())
                .forEach(System.out::println);
    }
}
