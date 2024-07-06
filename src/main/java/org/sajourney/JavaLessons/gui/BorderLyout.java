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
        frame.setLayout(new BorderLayout(10,10));
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

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100,100));

        //-------sub panels added
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.gray);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.lightGray);
        panel9.setBackground(Color.black);
        panel10.setBackground(Color.pink);

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));


        // ------sub panels

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.CENTER);


    }
}
