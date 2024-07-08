package org.sajourney.JavaLessons.sliderdemo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    SliderDemo(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);


    }


    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
