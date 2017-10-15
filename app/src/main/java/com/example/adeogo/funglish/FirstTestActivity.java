package com.example.adeogo.funglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FirstTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_test);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Lesson 10");
    }
}
