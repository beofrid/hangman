package com.hangman.wordutils;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReadFile 
{

    public  List<String> readFile(String filePath) throws IOException 
    {
        List<String> wordList = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        int charValue;
        FileReader file = null;

        try 
        {
            file = new FileReader(filePath, StandardCharsets.UTF_8);
            System.out.print("\033[H\033[2J");  

            while ((charValue = file.read()) != -1) 
            {
                char ch = (char) charValue;
                ////System.out.print(ch);
                if (ch == '\n') 
                {
                    wordList.add(currentLine.toString());
                    currentLine.setLength(0);
                } 
                else 
                {
                    currentLine.append(ch);
                }
            }
            if (currentLine.length() > 0) 
            {
                wordList.add(currentLine.toString());
            }

            
            
        }
        catch (IOException exception) 
        {
            System.out.println("Error reading the file: " + exception.getMessage());
        } 
        finally 
        {
            
            if (file != null) 
            {
                try 
                {
                    file.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }

        return wordList;
    }
}