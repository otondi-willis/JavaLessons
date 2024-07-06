package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.*;

public class BorderLyout {
    public static void main (String[] args){
        /* Layout Manager = Defines the natural layout for components
                            within a container
                            3 common managers
           BorderLayout   = places components in five areas:
                            north, south, west, east and center
                            all extra space is placed in the center area
        * */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.blue);
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.green);
        panel5.setBackground(Color.orange);


    }
}
