package org.sajourney.JavaLessons.gui;

import javax.swing.*;

public class OptionPane {
    public static void main(String[] args){
        //JOptionPane
        //pop up standard dialogue box that prompts users for a value or informs them sth

//        JOptionPane.showMessageDialog(null,"Plain message","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Information message","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Question message?","title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Warning message","title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Error message","title",JOptionPane.ERROR_MESSAGE);


//        JOptionPane.showConfirmDialog(null,"Do you even code?","This is my title", JOptionPane.YES_NO_OPTION);
//        JOptionPane.showConfirmDialog(null,"Do you even code?","This is my title", JOptionPane.YES_NO_CANCEL_OPTION);

//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("my name is " + name);

        JOptionPane.showOptionDialog(null,"you are awesome","secret message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null, 0);




    }
}
