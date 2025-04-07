// package com.hangman.gui;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.KeyAdapter;
// import java.awt.event.KeyEvent;

// public class ImageDisplay 
// {
//     private static JLabel wordLabel;
//     private static JLabel categoryLabel;
    
//     private static JTextField letterInput;

    

//     public static void imageDisplay() 
//     {
//         // Cria o JFrame
//         JFrame frame = new JFrame("Qual a palavra");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(900, 400);
//         frame.setLayout(new BorderLayout());

//         JPanel panel = new JPanel();
//         panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//         panel.setBackground(Color.BLACK); // background

//         wordLabel = new JLabel("▯PALAVRA▯");
//         wordLabel.setFont(new Font("DialogInput", Font.BOLD, 50));
//         wordLabel.setForeground(Color.green);
//         wordLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o rótulo

//         categoryLabel = new JLabel("categoria ❤❤︎♡");
//         categoryLabel.setFont(new Font("DialogInput", Font.BOLD, 20));
//         categoryLabel.setForeground(Color.green);
//         categoryLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o rótulo

//         panel.add(Box.createVerticalGlue()); // Adiciona espaço flexível acima
//         panel.add(wordLabel);
//         panel.add(Box.createVerticalStrut(10)); // Espaço entre os rótulos
//         panel.add(categoryLabel);
//         panel.add(Box.createVerticalGlue()); // Adiciona espaço flexível abaixo

//         frame.add(panel, BorderLayout.CENTER);


//         // Cria um JPanel para o JTextField com margens
//         JPanel inputPanel = new JPanel();
//         inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20)); // Alinha o campo de texto centralizado e afasta da borda inferior
//         inputPanel.setBackground(Color.BLACK);

//         letterInput = new JTextField();
//         letterInput.setFont(new Font("Monospaced", Font.BOLD, 30));
//         letterInput.setHorizontalAlignment(JTextField.CENTER);
//         letterInput.setPreferredSize(new Dimension(70, 70)); // Define o tamanho
//         letterInput.setBackground(Color.BLACK);
//         letterInput.setForeground(Color.GREEN);
//         letterInput.addKeyListener
//         (
//             new KeyAdapter() 
//             {
//                 public void keyTyped(KeyEvent e) 
//                 {
//                     if (letterInput.getText().length() >= 1) 
//                     {
//                         e.consume(); // Impede a inserção de mais de uma letra
//                     }
//                 }
//             }
//         );
//         inputPanel.add(letterInput);
//         // Adiciona o campo de texto na parte inferior do JFrame
//         frame.add(inputPanel, BorderLayout.SOUTH);



//         frame.setVisible(true);
//     }


   
// }