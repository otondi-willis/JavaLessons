package org.sajourney.JavaLessons.class_and_objects;

public class Calculator {

    public int addition (int num1, int num2){
        return num1 + num2;
    }
}
 class Main{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.addition(15,15));
    }
}
