package com.example.adeogo.funglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity2 extends AppCompatActivity {

    private TextView mNextTextView;
    private TextView mSkipTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);
        mSkipTextView = (TextView) findViewById(R.id.skip_2);

        mSkipTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mNextTextView = (TextView) findViewById(R.id.next_2);

        mNextTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity2.this, WelcomeActivity3.class);
                startActivity(intent);
            }
        });
    }
}
