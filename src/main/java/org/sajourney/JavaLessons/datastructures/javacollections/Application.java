package org.sajourney.JavaLessons.datastructures.javacollections;

import java.util.Collection;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Room kiambu = new Room("Ruiru","Premier room",4,175.00);
        Room siaya = new Room("Eastleigh","Suite",5,250.00);
        Room kisumu = new Room("Eastleigh","Suite",5,250.00);

        Room nairobi = new Room("Eastleigh","Suite",5,250.00);

        //Use of collections to manage rooms
        Collection<Room> rooms = List.of(kiambu,nairobi,siaya,kisumu);
        double total = getPotentialRevenue(rooms);
        System.out.println(total);
    }
    private static double getPotentialRevenue(Collection<Room> rooms){
        return rooms.stream()
                .mapToDouble(r->r.getRate())
                .sum();
    }
}
