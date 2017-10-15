package com.example.adeogo.funglish;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {
    FragmentManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mManager = getSupportFragmentManager();
        SignInFragment signInFragment = new SignInFragment();
        mManager.beginTransaction()
                .add(R.id.start_frame, signInFragment)
                .commit();
    }
}
