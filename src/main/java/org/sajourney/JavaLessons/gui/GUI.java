package org.sajourney.JavaLessons.gui;

import javax.swing.*;

public class GUI {
    public static void main (String[] args){
        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame();// creates a frame
        frame.setTitle("Title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);// sets the x-dimension and y- dimension
        frame.setVisible(true);// makes frame visible
    }
}
