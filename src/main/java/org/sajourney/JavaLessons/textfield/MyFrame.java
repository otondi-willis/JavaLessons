package org.sajourney.JavaLessons.textfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);



        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(new Color(0x00c00100));
        textField.setBackground(new Color(0x00fcf4f4));
        textField.setCaretColor(Color.WHITE);
        textField.setText("UserName");
        textField.setEditable(false);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("Welcome "+ textField.getText());

        }

    }
}
