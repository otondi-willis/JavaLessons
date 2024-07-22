package org.sajourney.JavaLessons.javacollections.map;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;
import org.sajourney.JavaLessons.javacollections.lists.Guest;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Room piccadilly = new Room("piccadilly", "Guest room",3,125);
        Room oxford = new Room("oxford","suite",5,224);

        Guest john = new Guest("John","Doe",false);
        Guest maria = new Guest("maria", "doe",true);

        Map<Room,Guest> assignments = new HashMap<>();
        assignments.put(oxford,maria);
        assignments.put(piccadilly,john);

        Guest guest = assignments.put(piccadilly,assignments.remove(oxford));
        assignments.putIfAbsent(oxford,guest);

        System.out.println("oxford: " + assignments.get(new Room("oxford","suite",5,224)));
        System.out.println("Piccadilly: " + assignments.get(piccadilly));


    }
}
