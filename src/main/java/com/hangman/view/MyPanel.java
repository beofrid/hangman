package com.hangman.view;

import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
    private LabelComponent wordLabel;
    private LabelComponent emptyLine;
    private LabelComponent categoryLabel;
    private LabelComponent hearts;
    private LabelComponent emptySpace;
    private LabelComponent attempts;

    public MyPanel() {
        setBackground(Color.BLACK); // background
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Margens entre os componentes

        // Configuração para a primeira linha (wordLabel)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Ocupa toda a largura
        gbc.fill = GridBagConstraints.HORIZONTAL;
        wordLabel = new LabelComponent();
        add(wordLabel.font24Label("▯palavra▯"), gbc);

        // Configuração para a segunda linha (emptyLine)
        gbc.gridy++;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Ocupa toda a largura
        gbc.fill = GridBagConstraints.HORIZONTAL;
        emptyLine = new LabelComponent();
        add(emptyLine.insertLine(), gbc);

        // Configuração para a terceira linha (categoryLabel e hearts)
        gbc.gridy++;
        gbc.gridwidth = 1; // Largura ajustada para os componentes
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        categoryLabel = new LabelComponent();
        add(categoryLabel.font16Label("[categoria]"), gbc);

        gbc.gridx = 1; // Posicionar o hearts ao lado do categoryLabel
        gbc.anchor = GridBagConstraints.EAST;
        hearts = new LabelComponent();
        add(hearts.font12Label(" ❤❤︎♡"), gbc);

        // Configuração para a linha seguinte (emptySpace)
        gbc.gridy++;
        gbc.gridx = 0; // Voltar para a primeira coluna
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Ocupa toda a largura
        gbc.fill = GridBagConstraints.HORIZONTAL;
        emptySpace = new LabelComponent();
        add(emptySpace.font12Label(" "), gbc);

        // Configuração para a última linha (attempts)
        gbc.gridy++;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Ocupa toda a largura
        gbc.fill = GridBagConstraints.HORIZONTAL;
        attempts = new LabelComponent();
        add(attempts.font12Label("A, J, K, N"), gbc);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new MyPanel());
        frame.setVisible(true);
    }
}