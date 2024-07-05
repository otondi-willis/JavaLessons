package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class MyFrame1 extends JFrame implements ActionListener {
public class MyFrame1 extends JFrame{
    JButton button;
    MyFrame1(){
        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("Im a button");
        button.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

//    @Override
//    public void actionPerformed(ActionEvent e){
//        if(e.getSource()==button){
//            System.out.println("poo");
//
//        }
//    }
}
