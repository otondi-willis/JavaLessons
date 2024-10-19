package org.sajourney.JavaLessons.OOPS;

class Example{
    private String name;
    private int age =30;


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Encapsulation {
    public static void main (String[] args){
        Example example=new Example();
        //example.name; name has private access
        System.out.println(example.getAge());
    }

}
