package org.sajourney.JavaLessons.datastructures.javacollections;

public class Application {
    public static void main(String[] args) {
        Room kiambu = new Room("Ruiru","Premier room",4,175.00);
        Room nairobi = new Room("Eastleigh","Suite",5,250.00);

        double total = getPotentialRevenue(kiambu,nairobi);
        System.out.println(total);
    }
    private static double getPotentialRevenue(Room room1, Room room2){
        return room1.getRate()+room2.getRate();
    }
}
