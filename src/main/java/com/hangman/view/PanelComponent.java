package com.hangman.view;

import javax.swing.*;
import java.awt.*;

public class PanelComponent {
    private static JPanel panel = new JPanel();



    public JPanel mainPanelAdd (JLabel label1, JLabel label2, JLabel label3, JLabel label4, JLabel label5, JLabel label6){
        panel.setBackground(Color.BLACK); // background
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
        panel.add(Box.createRigidArea(new Dimension(8, 3))); 
        panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GREEN));
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);


        return panel;
    }
}
