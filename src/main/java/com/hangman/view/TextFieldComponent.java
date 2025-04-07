package com.hangman.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class TextFieldComponent {
    private static JTextField letterInput;


      
    public JTextField textField (){
         
        letterInput = new JTextField(3);
        // letterInput.setPreferredSize(new Dimension(50, 50)); // Define o tamanho
        letterInput.setFont(new Font("Monospaced", Font.BOLD, 30));
        letterInput.setBackground(Color.black);
        letterInput.setForeground(Color.GREEN);
        letterInput.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN));
        // letterInput.setHorizontalAlignment(JTextField.CENTER);

        letterInput.addKeyListener
        (
            new KeyAdapter() 
            {
                public void keyTyped(KeyEvent e) 
                {
                    if (letterInput.getText().length() >= 1) 
                    {
                        e.consume(); // Impede a inserção de mais de uma letra
                    }
                }
            }
        );

        return letterInput;


    };



}
            