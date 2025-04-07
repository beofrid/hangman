// package com.hangman.gui;

// import javax.swing.ImageIcon;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import java.awt.Color;
// import java.awt.GridLayout;
// //Ativar o changeDisplay a partir do CLI

// public class ImageDisplay {
//     private static JLabel[] labels = new JLabel[24];

//     public static void imageDisplay() {
//         // Cria o JFrame
//         JFrame frame = new JFrame("Exemplo de Múltiplas Imagens no JFrame");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(1100, 400);

//         // Cria um JPanel com GridLayout
//         JPanel panel = new JPanel();
//         panel.setLayout(new GridLayout(2, 12, 0, 0));
//         panel.setBackground(Color.BLACK); // Define a cor de fundo

//         // Adiciona 24 imagens ao JPanel e armazena os JLabels no array
//         for (int i = 0; i < 24; i++) {
//             String imagePath = "hangman/src/main/java/com/hangman/gui/img/null.png";
//             ImageIcon imageIcon = new ImageIcon(imagePath);
//             JLabel label = new JLabel(imageIcon);
//             panel.add(label);
//             labels[i] = label; // Armazena o JLabel no array
//         }

//         // Adiciona o JPanel ao JFrame
//         frame.add(panel);

//         // Torna o JFrame visível
//         frame.setVisible(true);

   
//     }

//     public static void changeDisplay(int index, String path) {
//         if (index < 0 || index >= labels.length) {
//             System.out.println("Índice inválido");
//             return;
//         }

//         String imagePath = "hangman/src/main/java/com/hangman/gui/img/"+ path +".jpg";
//         ImageIcon imageIcon = new ImageIcon(imagePath);
//         labels[index].setIcon(imageIcon); // Substitui a imagem no JLabel
//     }
// }