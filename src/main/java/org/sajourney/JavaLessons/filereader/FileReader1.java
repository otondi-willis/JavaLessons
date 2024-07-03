package org.sajourney.JavaLessons.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args){
        /* FileReader = read the contents of a file as a stream of characters.
                        one by one read() returns an int value which contains the byte
                        value when read() returns -1, there is no more data to be read

        * */
        try {
        FileReader reader = new FileReader("poem.txt");
        int data = reader.read();
        while(data != -1){
            System.out.print((char)data);
            data = reader.read();
        }
        reader.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
