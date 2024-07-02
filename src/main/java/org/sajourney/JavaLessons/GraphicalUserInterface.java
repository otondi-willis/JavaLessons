package org.sajourney.JavaLessons;

import javax.swing.*;

public class GraphicalUserInterface {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello " + name);


    }
}
