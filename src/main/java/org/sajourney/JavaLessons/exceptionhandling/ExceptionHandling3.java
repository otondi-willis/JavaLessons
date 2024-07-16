package org.sajourney.JavaLessons.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {
    /*
     * ways to handle multiple exceptions
     * Polymorphism
     * series of catch blocks
     * multiple catch block
     * */
    public static void main(String[] args) {

        File file = new File("D:\\3A\\filenumber.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
        }
        catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }







    }
}
