package com.hangman.model;

import java.util.Random;

import com.hangman.control.DisplayController;
import com.hangman.data.DBInitializer;
import com.hangman.wordutils.Base64StringHandler;
import com.hangman.wordutils.WordData;


public class RandomNodeProvider {
    //database instance to use the methods
    private DBInitializer db = new DBInitializer();
    //ToDo maybe I need to create a selector with all IDs from the table, then insert them in a array and use the random method. Think about node exclusion        




    public void getRandom() 
    {

        String decodedWord, decodedHint;
        //Instance Base64StringHandler to decode the strings obtained from the database
        Base64StringHandler decode = new Base64StringHandler();
        //WordData is a data type, from WordData class that contain a instance of the word and the hint from DB
        WordData wordObject;
        
        //clear the console
        System.out.print("\033[H\033[2J");
        
        int range [] = db.maxgetRangeBoundsValue();
        int min = range[0];
        int max = range[1];
        Random random = new Random();
        int randomIntInRange = random.nextInt(max - min + 1) + min;
        System.out.println("\n RANDOM NODE PROVIDER SAYS: \n\t >>> Random number between " + min + " and " + max + ": " + randomIntInRange + "\n");
        
        wordObject = db.selectWord(randomIntInRange);
        decodedWord = decode.decodeString(wordObject.getWord());
        decodedHint = decode.decodeString(wordObject.getHint());

        //
        System.out.println(decodedWord);
        System.out.println(decodedHint);

        //rodar no CLI (inacabado)
        //Cli cli = new Cli();
        //cli.gameStart(decodedWord,decodedHint);
        GameInstance gm = new GameInstance(decodedWord, decodedHint, 1);
        DisplayController dc = new DisplayController();
        dc.updateMemory(gm);


    }


    public void unnamed (String word, String Hint, int difficulty)
    {
        String spc = " ";
        System.out.println("\n RANDOM NODE PROVIDER SAYS: \n\t >>>" + word + spc + Hint + spc + difficulty );

    }


    
}
