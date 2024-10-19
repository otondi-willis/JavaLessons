package org.sajourney.JavaLessons.OOPS;

class Example{
    private String name;
    private int age;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age, Example example1){//lengthy way to assign local variable to an instance variable
        Example example=example1;
        example.age = age;
    }

}
public class Encapsulation {
    public static void main (String[] args){
        Example example=new Example();
        //example.name; name has private access
        example.setAge(40, example);
        System.out.println(example.getAge());

        example.setName("Omondi");

        System.out.println(example.getName());
    }

}
