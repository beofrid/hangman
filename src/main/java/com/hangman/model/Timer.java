package com.hangman.model;

import javax.swing.JFrame;
import javax.swing.JPanel;
//TODO formatar esta classe
public class Timer {
     public static void countdownTimer(JPanel panel, JFrame frame) {
        // Tempo inicial da contagem regressiva (em segundos)
        int countdownTime = 2;

        // Loop de contagem regressiva
        for (int i = countdownTime; i >= 0; i--) {
            System.out.println(i);
            try {
                // Pausa por 1 segundo
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Tratamento da interrupção
                e.printStackTrace();
            }
        }

        // Mensagem ao final da contagem
        System.out.println("Tempo esgotado!");
    
    }
}
