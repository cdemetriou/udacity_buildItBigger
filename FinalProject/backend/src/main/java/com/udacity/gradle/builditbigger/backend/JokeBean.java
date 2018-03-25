package com.udacity.gradle.builditbigger.backend;

import com.example.jokeslibrary.JokeClass;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private JokeClass jokes;

    public JokeBean() {
        jokes = new JokeClass();
    }

    public String getJoke() {
        return jokes.getJoke();
    }

}