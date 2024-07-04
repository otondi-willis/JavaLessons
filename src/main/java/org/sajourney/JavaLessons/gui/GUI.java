package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main (String[] args){
        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame();// creates a frame
        frame.setTitle("Title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);// sets the x-dimension and y- dimension
        frame.setVisible(true);// makes frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\teleafia pics\\logo.PNG");//create an image icon
        frame.setIconImage(image.getImage());//change icon of frame
        //frame.getContentPane().setBackground(Color.blue);// Change background color
        frame.getContentPane().setBackground(new Color(0xfcf4f4));

    }
}
