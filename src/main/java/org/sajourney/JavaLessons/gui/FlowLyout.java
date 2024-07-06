package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.*;

public class FlowLyout {
    public static void main (String[] args){
        /* Layout Manager = Defines the natural layout for components
                            within a container
                            3 common managers
           FlowLayout   = places components in a row, sized at their preferred size.
                            if the horizontal space in the container is too small,
                            the FlowLayout class uses the next available row.

        * */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());


        frame.add(new JButton("1"));
        frame.add(new JButton("1"));
        frame.add(new JButton("1"));
        frame.add(new JButton("1"));
        frame.add(new JButton("1"));
        frame.add(new JButton("1"));
        frame.add(new JButton("1"));
        frame.add(new JButton("1"));
        frame.add(new JButton("1"));

            frame.setVisible(true);

        }



}
