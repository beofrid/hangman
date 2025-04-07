package com.hangman.model;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        RandomNodeProvider rnp = new RandomNodeProvider();
        rnp.getRandom();
        System.out.flush();

        
        
        
    }


    public void gameStart (String word, String Hint){
        int verify = 5;
        int wl =word.length();
        Scanner scan = new Scanner(System.in);
        String line = "----------------------------------------------------------------------------------------------------------", userSend;
        word.toUpperCase();

        System.out.println(line);
        System.out.println("BEM VINDO AO JOGO DE ADIVINHAR PALAVRAS");
        System.out.println(line);
        System.out.println("\nA palavra tem " + wl + " caracteres.\n");
        System.out.println(line);
        while (verify != 0){
            System.out.println(line);
            System.out.println("Sua tentatinva: \n");
            System.out.println(line);
            userSend = scan.nextLine(); 
            userSend.toUpperCase();
           

            for(int i = 0; i<wl; i++)
            {   String charAt = Character.toString(word.charAt(i));
        
                if(userSend.equals(charAt))
                {
                    System.out.println(userSend + " = " + charAt);

                }
            }
            verify--;

        }
        scan.close();















    }

    
    
}
