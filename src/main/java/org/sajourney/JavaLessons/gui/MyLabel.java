package org.sajourney.JavaLessons.gui;

import javax.swing.*;

public class MyLabel {

    public static void main(String[] args){
        JLabel label = new JLabel();//create a label
        label.setText("Bro, do you even code");//set text of label

        JFrame frame = new JFrame();

        frame.setTitle("Title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);// sets the x-dimension and y- dimension
        frame.setVisible(true);// makes frame visible
        frame.add(label);
    }

}
