package org.sajourney.JavaLessons;

import java.util.Scanner;

public class FindHypotenuse {
    public static void main(String[] args){
        double x;
        double y;
        double z;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side x:");
        x = scan.nextDouble();

        System.out.println("Enter side y: ");
        y = scan.nextDouble();

        z = Math.sqrt(x*x + y*y);

        System.out.println("The value of hypotenuse is :" + z);

        scan.close();




    }
}
