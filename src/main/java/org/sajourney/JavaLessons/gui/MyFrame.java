package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setTitle("Title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);// sets the x-dimension and y- dimension
        this.setVisible(true);// makes frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\teleafia pics\\logo.PNG");//create an image icon
        this.setIconImage(image.getImage());//change icon of frame
        //frame.getContentPane().setBackground(Color.blue);// Change background color
        this.getContentPane().setBackground(new Color(0xd9d9d9));
    }
}
