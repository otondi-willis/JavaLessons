package org.sajourney.JavaLessons.other;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String firstName = scan.next();
        scan.nextLine();

        System.out.println("Enter your names");
        String fullNames = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter value of pie");
        float pie = scan.nextFloat();

        System.out.println(firstName);
        System.out.println(fullNames);
        System.out.println(age);
        System.out.println(pie);




    }
}
