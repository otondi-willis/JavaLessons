package org.sajourney.JavaLessons.javacollections.sorting;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {

        public static void main(String[] args) {
            Room kiambu = new Room("Ruiru","Premier room",4,175.00);
            Room siaya = new Room("Eastleigh","Suite1",5,250.00);
            Room kisumu = new Room("Eastleigh","Suite",5,250.00);

           List<Room> rooms = new ArrayList<>(List.of(kiambu,siaya,kisumu));
           rooms.stream()
                   .forEach(r-> System.out.format("%-15s %-15s %-10f %n", r.getName(),r.getType(),r.getRate()));

            Collections.sort(rooms);

        }


}
