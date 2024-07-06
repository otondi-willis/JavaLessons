package org.sajourney.JavaLessons.gui;

import javax.swing.*;
import java.awt.*;

public class GridLyout {
    /* Layout Manager = Defines the natural layout for components
                            within a container
                            3 common managers
           GridLayout   = places components in a grid of cells.
                            Each component takes all the available space within the cell
                            and each cell is the same size.


        * */
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JButton button1 = new JButton();
        frame.setVisible(true);


    }
}
