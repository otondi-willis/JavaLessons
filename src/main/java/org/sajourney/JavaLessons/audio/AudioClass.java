package org.sajourney.JavaLessons.audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioClass {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scan = new Scanner(System.in);
        File file = new File("MoonlightSonata.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);


        String response = "";


        while(!response.equals("Q")){
            System.out.println("P = play, S = stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scan.next();
            response = response.toUpperCase();

            switch(response){
                case ("P") : clip.start();
                break;
                case ("S") : clip.stop();
                break;

                default:
                    System.out.println("Not a valid response");
            }


        }

        clip.start();
    }
}
