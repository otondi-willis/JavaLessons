package org.sajourney.JavaLessons.radiobuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    JRadioButton pizzaButton;
    JRadioButton chipsButton;
    JRadioButton chickenButton;
    ImageIcon checkIcon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

//        xIcon = new ImageIcon("D:\\HT\\Teleafia_patient_app\\assets\\about_us.PNG");
//        checkIcon = new ImageIcon("D:\\HT\\Teleafia_patient_app\\assets\\bmi.PNG");

        pizzaButton = new JRadioButton("pizza");
        chickenButton = new JRadioButton("chicken");
        chipsButton = new JRadioButton("chips");




        this.add(pizzaButton);
        this.add(chickenButton);
        this.add(chipsButton);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println(checkBox.isSelected());


        }

    }
}

