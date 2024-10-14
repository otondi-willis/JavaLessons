package org.sajourney.JavaLessons.other;

public class ObjectPassing {
    public static void main(String[] args){
        Garage garage = new Garage();
        Car car = new Car();

        garage.park(car);
    }
}
