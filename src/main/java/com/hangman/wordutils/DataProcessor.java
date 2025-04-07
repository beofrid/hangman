package com.hangman.wordutils;

import java.io.IOException;
import java.util.List;

public class DataProcessor 
{
  public static void processWord() 
  {
    String charToString, encodedWord, encodedHint;
    String filePath = "hangman\\src\\main\\java\\com\\hangman\\wordutils\\wordsDatabase.txt";
    int hyphenIndex;
    ReadFile readFileInstance = new ReadFile();

    try 
	{
      	List<String> wordList = readFileInstance.readFile(filePath);

      	for (String list : wordList) 
	  	{
			String wordString = "", hintString = "";
			hyphenIndex = list.indexOf("-");
			for (int i = 0; i < hyphenIndex; i++) 
			{	
				if (!Character.isWhitespace(list.charAt(i))) 
				{
					charToString = Character.toString(list.charAt(i));
					wordString = wordString.concat(charToString);
				}
			}
			for (int i = hyphenIndex + 1; i < list.length(); i++) 
			{	
				if (!Character.isWhitespace(list.charAt(i))) 
				{
					charToString = Character.toString(list.charAt(i));
					hintString = hintString.concat(charToString);
				}
			}
			Base64StringHandler encode = new Base64StringHandler ();

    		encodedWord = encode.encodeString(wordString);
    		encodedHint = encode.encodeString(hintString);
			System.out.println(encodedWord+encodedHint);
			
			

			//*	ativar apenas se for inserir novas palavras 
			//* verificar uma forma de evitar de inserir palavras duplicadas 		
			//?DBInitializer dbInitializer = new DBInitializer();
 			//?dbInitializer.insertWords(encodedWord,encodedHint, 01);
    	}
    } 
	catch (IOException e) 
	{
    	System.out.println("Error reading the file: " + e.getMessage());
    }

    System.out.print("\033[H\033[2J");



  }

}