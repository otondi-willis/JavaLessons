package org.sajourney.JavaLessons.CopyObjects;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(){

    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String setMake(String make){
        this.make = make;
        return make;
    }
    public String setModel(String model){
        this.model = model;
        return model;
    }
    public int setYear(int year){
        this.year = year;
        return year;
    }
}
