package org.sajourney.JavaLessons.gui;

import javax.swing.*;

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
        frame.setVisible(true);




    }
}
