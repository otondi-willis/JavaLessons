package org.sajourney.JavaLessons.gui;

import javax.swing.*;

public class OptionPane {
    public static void main(String[] args){
        //JOptionPane
        //pop up standard dialogue box that prompts users for a value or informs them sth

        JOptionPane.showMessageDialog(null,"Hello there","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello there","title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello there","title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello there","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello there","title",JOptionPane.ERROR_MESSAGE);



    }
}
