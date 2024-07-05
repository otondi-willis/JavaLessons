package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class MyFrame1 extends JFrame implements ActionListener {
public class MyFrame1 extends JFrame{
    JButton button;
    MyFrame1(){
        ImageIcon icon = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\New folder\\dice3.PNG");


        button = new JButton();
        button.setBounds(100,100,250,200);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("Im a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-5);
        button.setForeground(Color.blue);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());





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
