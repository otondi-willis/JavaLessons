package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.*;

public class LayredPane {
    // JLayeredPane = Swing container that provides a third dimension for positioning
    //                 components ex depth and z index

    public static void main(String[] args){

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
