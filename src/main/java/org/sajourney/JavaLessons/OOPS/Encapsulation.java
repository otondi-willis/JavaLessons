package org.sajourney.JavaLessons.OOPS;

class Example{
    private String name;
    private int age;


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Encapsulation {
    Example example=new Example();
    //example.name; name has private access
}
