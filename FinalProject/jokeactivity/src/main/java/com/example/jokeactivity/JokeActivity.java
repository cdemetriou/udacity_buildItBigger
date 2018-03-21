package com.example.jokeactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by christosdemetriou on 21/03/2018.
 */

public class JokeActivity extends AppCompatActivity {

    public final static String INTENT_JOKE = "INTENT_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getStringExtra(INTENT_JOKE);
        TextView textViewJoke = findViewById(R.id.joke_view);
        textViewJoke.setText(joke);
    }

}