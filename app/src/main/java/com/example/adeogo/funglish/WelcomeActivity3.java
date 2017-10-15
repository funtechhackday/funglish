package com.example.adeogo.funglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity3 extends AppCompatActivity {

    private TextView mNextTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome3);

        mNextTextView = (TextView) findViewById(R.id.next_3);
        mNextTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
