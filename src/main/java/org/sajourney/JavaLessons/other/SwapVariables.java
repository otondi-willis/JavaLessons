package org.sajourney.JavaLessons.other;

public class SwapVariables {
    public static void main (String[] args){
        String x = "milk";
        String y = "tea";

        String temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
