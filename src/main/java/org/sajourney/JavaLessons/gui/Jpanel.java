package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.*;

public class Jpanel {
    //JPanel = A GUI component that functions as a container to hold other components
    public static void main(String[] args){
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(redPanel);
    }



}
