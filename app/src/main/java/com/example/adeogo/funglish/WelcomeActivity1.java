package com.example.adeogo.funglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity1 extends AppCompatActivity {

    private TextView mSkipTextView;
    private TextView mNextTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome1);

        mSkipTextView = (TextView) findViewById(R.id.skip_1);
        mNextTextView = (TextView) findViewById(R.id.next_1);

        mSkipTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mNextTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity1.this, WelcomeActivity2.class);
                startActivity(intent);
            }
        });
    }
}
