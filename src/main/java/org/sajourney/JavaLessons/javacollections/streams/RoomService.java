package org.sajourney.JavaLessons.javacollections.streams;

import org.sajourney.JavaLessons.datastructures.javacollections.Room;

import java.util.Collection;
import java.util.LinkedHashSet;

public class RoomService {
    public RoomService(){
        this.inventory = new LinkedHashSet<>();
    }
    public Collection<Room> getRoomsByCapacity(final int requiredCapacity){
        return null;
    }
    public Collection<Room> getRoomByRateAndType(final double rate, final String type){
        return null;
    }
    public boolean hasRoom(Room room){
        return this.inventory.contains(room);
    }

}
