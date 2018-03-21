package com.example.jokeslibrary;


import java.util.Random;

public class JokeClass {

    private String[] jokes;
    private Random random;

    public JokeClass() {
        jokes = new String[3];
        jokes[0] = "JOKE 1";
        jokes[1] = "JOKE 2";
        jokes[2] = "JOKE 3";
        jokes[3] = "JOKE 4";
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}