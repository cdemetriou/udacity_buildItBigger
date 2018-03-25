package com.udacity.gradle.builditbigger.backend;

import com.example.jokeslibrary.JokeClass;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private JokeClass jokeTelling;

    public JokeBean() {
        jokeTelling = new JokeClass();
    }

    public String getJoke() {
        return jokeTelling.getRandomJoke();
    }

}