package org.sajourney.JavaLessons.class_and_objects;

public class Calculator {

    public int addition (int num1, int num2){
        return num1 + num2;
    }
    public int addition (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
 class Main{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers " + calc.addition(15,15));
        System.out.println("Addition of three integers " + calc.addition(15,15,50));
    }
}
