package org.sajourney.JavaLessons.javacollections.streams;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RoomService {
    public Collection<Room> inventory;
    public RoomService(){
        this.inventory = new LinkedHashSet<>();
    }
    public void applyDiscount(final double discount){
        this.inventory.forEach(r->r.setRate(r.getRate()*(1-discount)));
    }
    public Collection<Room> getRoomsByCapacity(final int requiredCapacity){
        Collection<Room> matches = new HashSet<>();
        for (Room room:inventory){
            if(room.getCapacity() >= requiredCapacity){
                matches.add(room);
            }

        }


        return matches;
    }
    public Collection<Room> getRoomByRateAndType(final double rate, final String type){

         return this.inventory.stream()
                 .filter(r -> r.getRate()<rate)
                 .filter(r->r.getType().equals(type))
                 .collect(Collectors.toList());
    }
    public boolean hasRoom(Room room){
        return this.inventory.contains(room);
    }

}
