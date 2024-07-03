package org.sajourney.JavaLessons.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
    public static void main(String[] args){
        try{
        FileWriter writer = new FileWriter("poem.txt");
        writer.write("Roses are red \n Violets are blue");
        writer.append("\n (a poem by Wil)");
        writer.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
