package org.sajourney.JavaLessons.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowableExceptions {
    /*
     *
     * */
    public static double calculatePay(double hours, double payRate) throws NegativeInputException{
        //throwing unchecked exceptions
        if(hours > 40){
        throw new IllegalArgumentException("Hours must be less than or equal to 40");
    }
        //throwing checked exceptions
        if (hours < 0 || payRate <0){
            throw new NegativeInputException();
        }
        return hours * payRate;
    }
    public static void main(String[] args) {

    }


}
