package org.sajourney.JavaLessons.javacollections.iterators;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge","Premier",6,175.00);
        Room piccadilly = new Room("Picaddilly","Guest Room",3,125.00);
        Room westminister = new Room("Westminister","Premier Room",4,200.00);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly,cambridge,westminister));

        Iterator<Room> iterator = rooms.iterator();

        while(iterator.hasNext()){
            Room room = iterator.next();
            System.out.println(room.getName());
        }
        System.out.println();
        for(Room room: rooms){
            System.out.println(room.getName());
        }


    }
}
