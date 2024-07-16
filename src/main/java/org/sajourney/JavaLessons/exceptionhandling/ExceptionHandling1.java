package org.sajourney.JavaLessons.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        //Stack Trace
        //an interactive log of method calls that led to a thrown exception
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println("Sorry, an error has occured" + e.getMessage());
            e.printStackTrace();
        }
       //Checked exceptions-verified by the compiler before code execution
        //used when there is a possibility of recovery

        // Unchecked exceptions-not verified by the compiler before code execution
        //used when there is not anything that can be done

        /*
        * ways to handle multiple exceptions
        * Polymorphism
        * series of catch blocks
        * multiple catch block
        * */


    }
}
