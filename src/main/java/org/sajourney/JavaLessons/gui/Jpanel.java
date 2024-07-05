package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.*;

public class Jpanel {
    //JPanel = A GUI component that functions as a container to hold other components
    public static void main(String[] args){

        ImageIcon icon = new ImageIcon("C:\\Users\\ADMIN\\Pictures\\Snip1.PNG");

        JLabel label = new JLabel();
        label.setText("HI");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }



}
