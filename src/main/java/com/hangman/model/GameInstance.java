package com.hangman.model;

public class GameInstance {
    private String word;
    private String category;
    private int difficulty;


    public String getWord() {
        return word;
    }


    public String getCategory() {
        return category;
    }


    public int getDifficulty() {
        return difficulty;
    }


    public GameInstance(String word, String category, int difficulty) {
        this.word = word;
        this.category = category;
        this.difficulty = difficulty;
    }
    






}
