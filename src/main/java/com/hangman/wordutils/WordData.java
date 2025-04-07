package com.hangman.wordutils;

public class WordData {
    private String word;
    private String hint;
    private int difficulty;



    public WordData(String word, String hint, int difficulty) {
        this.word = word;
        this.hint = hint;
        this.difficulty = difficulty;
    }


    
    public String getWord() {
        return word;
    }




    public String getHint() {
        return hint;
    }




    public int getDifficulty() {
        return difficulty;
    }









}
