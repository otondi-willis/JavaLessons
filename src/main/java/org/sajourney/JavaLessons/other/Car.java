package org.sajourney.JavaLessons.other;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2021;

    public String toString(){
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
    }
}
