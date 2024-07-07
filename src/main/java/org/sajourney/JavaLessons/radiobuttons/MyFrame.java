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

        pizzaButton.addActionListener(this);
        chickenButton.addActionListener(this);
        chipsButton.addActionListener(this);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizzaButton);
        buttonGroup.add(chickenButton);
        buttonGroup.add(chipsButton);





        this.add(pizzaButton);
        this.add(chickenButton);
        this.add(chipsButton);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==pizzaButton){
            System.out.println("You selected pizza");
        } else  if (e.getSource()==chickenButton){
            System.out.println("You selected chicken");
        } else {

                System.out.println("You selected chips");

        }

    }
}

