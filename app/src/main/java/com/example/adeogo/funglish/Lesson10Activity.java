package com.example.adeogo.funglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Lesson10Activity extends AppCompatActivity {

    private TextView mSecondTextView;
    private TextView mReadTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson10);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Lesson 10");
        mReadTextView = (TextView) findViewById(R.id.read_10);
        mSecondTextView = (TextView) findViewById(R.id.second_test_10);

        mReadTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lesson10Activity.this,FirstTestActivity.class);
                startActivity(intent);
            }
        });

        mSecondTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lesson10Activity.this,SecondTestActivity.class);
                startActivity(intent);
            }
        });
    }
}
