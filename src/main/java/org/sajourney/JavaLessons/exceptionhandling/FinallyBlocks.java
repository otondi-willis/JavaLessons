package org.sajourney.JavaLessons.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlocks {
    public static void main(String[] args) {
        /*
        * try with resources
        * declaration of resources that should be automatically closed after
        * the execution of a try block
        * (eligible resources)try with resources only works with classes that implement Closeable or AutoCloseable
        * finally
        * (alternative to using finally to close resources)
        * (can be used with try with resources to execute other statements)
        * */

        File inputFile = new File("D:\\3A\\filenumber.txt");
        File outputFile = new File("D:\\3A\\filenumber1.txt");

        try (
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile);
        ){

            while (fileReader.hasNext()) {
                fileWriter.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
