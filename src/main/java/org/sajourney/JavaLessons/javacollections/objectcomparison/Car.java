package org.sajourney.JavaLessons.javacollections.objectcomparison;

public class Car {
    private String make;
    private String model;
    private int mileage;
    public Car(String make, String model, int mileage){
        this.make=make;
        this.model=model;
        this.mileage=mileage;

    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make=make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getMileage(){
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage=mileage;
    }
}
