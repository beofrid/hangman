package com.hangman.view;
import javax.swing.*;
import java.awt.*;


public class MainView 
{
    private static LabelComponent wordLabel;
    private static LabelComponent categoryLabel;
    private static LabelComponent hearts;
    private static LabelComponent emptyLine;
    private static LabelComponent emptySpace;
    private static LabelComponent attempts;
    private static LabelComponent inputText;
    private static TextFieldComponent letterInput;
    

    

    public static void mainView(String wordString, String categoryString, String attemptString) 
    {
        

        // Cria o JFrame
        JFrame frame = new JFrame("Qual a palavra");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocation(100, 100 );
        //TODO configurar o aplicativo para usar Undecorated
        //frame.setUndecorated(true);

        PanelComponent panel = new PanelComponent();

        wordLabel = new LabelComponent();
        emptyLine = new LabelComponent();
        categoryLabel = new LabelComponent();
        hearts =new LabelComponent(); 
        emptySpace = new LabelComponent();
        attempts = new LabelComponent();
        frame.add(
            panel.mainPanelAdd
            (
                wordLabel.font24Label(wordString),
                emptyLine.insertLine(),
                categoryLabel.font16Label("[anatomia de dinossauro]"),
                hearts.font12Label(" ❤❤︎❤❤︎♡"),
                emptySpace.font12Label(" "),
                attempts.font12Label("A, J, K, N")

            ), BorderLayout.CENTER);



        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 20)); // Alinha o campo de texto centralizado e afasta da borda inferior
        inputPanel.setBackground(Color.BLACK);        
        inputPanel.add(Box.createRigidArea(new Dimension(8, 3))); 

        
        inputText = new LabelComponent();
        inputPanel.add(inputText.font24Label("Insira a letra: "));
        
        letterInput = new TextFieldComponent();
        inputPanel.add(letterInput.textField());
       
        frame.add(inputPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }



    


   
}



