package org.sajourney.JavaLessons.datastructures.javacollections;

import java.util.Comparator;

public class Room implements Comparable<Room>{
    public static Comparator<Room> RATE_COMPARATOR = Comparator.comparing(Room::getRate);
    private String name;
    private String type;
    private int capacity;
    private double rate;
    boolean petFriendly;


    public Room(String name, String type, int capacity, double rate){
        this.name=name;
        this.type=type;
        this.capacity=capacity;
        this.rate=rate;

        petFriendly=false;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    @Override
    public int compareTo(Room o) {
        int result = this.getName().compareTo(o.getName());
        return result != 0?result: this.getType().compareTo(o.getType());
    }
}
