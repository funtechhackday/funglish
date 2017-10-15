package com.example.adeogo.funglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EndAdvancedActivity extends AppCompatActivity {

    private View mProceedView;
    private View mBackStartView;
    private TextView mShowTextView;

    private String texted = "Proceed to TOEFL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_advanced);
        mProceedView = findViewById(R.id.proceed_to_toefl);
        mBackStartView = findViewById(R.id.back_to_start_id);
        mShowTextView = (TextView) findViewById(R.id.show_tv);

        mShowTextView.setTextColor(getResources().getColor(R.color.green1));
        mShowTextView.setText(texted);

        mProceedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texted = "Proceed to TOEFL";
                mShowTextView.setText(texted);
                mShowTextView.setTextColor(getResources().getColor(R.color.green1));
            }
        });

        mBackStartView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texted = "Go to start page";
                mShowTextView.setText(texted);
                mShowTextView.setTextColor(getResources().getColor(R.color.red1));
            }
        });

        mShowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                if (TextUtils.equals(texted, "Go to start page")){
                    intent = new Intent(EndAdvancedActivity.this, MainActivity.class);
                }else {
                    intent = new Intent(EndAdvancedActivity.this, ToeflActivity.class);
                }

                startActivity(intent);
            }
        });
    }
}
