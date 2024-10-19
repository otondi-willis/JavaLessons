package org.sajourney.JavaLessons.static_concept;

class Example{
    String name;
    static{
        System.out.println("inside of static block");
    }
    public Example(){
        System.out.println("inside of a constructor");
    }
}

public class StaticBlock {
    public static void main (String[] args){
        System.out.println("Printout one");

        //object creation
        //static block is called once

        Example example=new Example();

        //constructor called again but not static block
        Example example1=new Example();

    }
}
