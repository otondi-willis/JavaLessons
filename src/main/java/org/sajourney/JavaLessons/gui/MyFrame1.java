package org.sajourney.JavaLessons.gui;

import javax.swing.*;

public class MyFrame1 extends JFrame {
    MyFrame1(){
        JButton button = new JButton();
        button.setBounds(200,100,100,50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
