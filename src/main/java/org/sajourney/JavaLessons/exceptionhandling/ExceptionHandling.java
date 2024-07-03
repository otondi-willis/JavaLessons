package org.sajourney.JavaLessons.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scan.nextInt();
            System.out.println("Enter a whole numbe to divide by:");
            int y = scan.nextInt();

            int z = x / y;

            System.out.println(y);
        } catch(ArithmeticException e){
            System.out.println("You can't divide by zero!");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            //System.out.println("This will always print");
            scan.close();
        }
    }
}
