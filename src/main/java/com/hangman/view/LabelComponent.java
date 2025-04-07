package com.hangman.view;

import java.awt.*;

import javax.swing.JLabel;

public class LabelComponent 
{

    private static JLabel font24;
    private static JLabel font16;
    private static JLabel font12;
    private static JLabel line;



    public JLabel font24Label (String s) 
    {
        font24 = new JLabel(s);//"▯palavra▯"
        font24.setFont(new Font("DialogInput", Font.BOLD, 24));
        font24.setForeground(Color.green);
        font24.setAlignmentX(Component.LEFT_ALIGNMENT); 

        return font24;
    }

    public JLabel insertLine () 
    { 
        line = new JLabel("____________________________________________________________________"); 
        line.setFont(new Font("DialogInput", Font.BOLD, 12));
        line.setForeground(Color.green);
        line.setAlignmentX(Component.LEFT_ALIGNMENT);

        return line;
    }
    
    public JLabel font16Label (String s)
    {
        font16 = new JLabel(s); //"[categoria]"
        font16.setFont(new Font("DialogInput", Font.BOLD, 16));
        font16.setForeground(Color.green);
        font16.setAlignmentX(Component.LEFT_ALIGNMENT);

        return font16;
    }


   public JLabel font12Label (String s)
   {
        font12 = new JLabel(s); //" ❤❤︎♡"
        font12.setFont(new Font("DialogInput", Font.BOLD, 12));
        font12.setForeground(Color.green);
        font12.setAlignmentX(Component.LEFT_ALIGNMENT);

        return font12;
   }


    
   










    
}
