package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel {

    public static void main(String[] args){
        JLabel label = new JLabel();//create a label
        ImageIcon image = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\teleafia pics\\logo.PNG");//create an image icon
        Border border = BorderFactory.createLineBorder(Color.green,3);
        label.setText("Bro, do you even code");//set text of label
        label.setIcon(image);//change icon of frame
        label.setHorizontalTextPosition(JLabel.CENTER);// left, center, right of image icon
        label.setVerticalTextPosition(JLabel.BOTTOM);// top, center or bottom
        label.setForeground(new Color(0xffb50808));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(20);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);



        JFrame frame = new JFrame();

        frame.setTitle("Title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);// sets the x-dimension and y- dimension
        frame.setVisible(true);// makes frame visible
        frame.add(label);
    }

}
