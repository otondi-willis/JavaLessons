package org.sajourney.JavaLessons.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class RethrowingExceptions {
    public static void main(String[] args) throws IOException {
        rethrowException();
    }
    public static void rethrowException() throws IOException {
    File file = new File("D:\\3A\\filenumber.txt");
    file.createNewFile();}

}
