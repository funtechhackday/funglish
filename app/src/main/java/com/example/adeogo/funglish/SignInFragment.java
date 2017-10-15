package com.example.adeogo.funglish;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SignInFragment extends Fragment {

    private TextView mSignUpTextView;
    private TextView mSignInTextView;
    private TextView mSignInVkTextView;
    private TextView mSignInFacebookTextView;
    private TextView mSignInGmailTextView;

    public SignInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_sign_in, container, false);
        mSignUpTextView = rootView.findViewById(R.id.sign_up_id);
        mSignInTextView = rootView.findViewById(R.id.sign_in);
        mSignInFacebookTextView = rootView.findViewById(R.id.sign_in_facebook);
        mSignInGmailTextView = rootView.findViewById(R.id.sign_in_gmail);
        mSignInVkTextView = rootView.findViewById(R.id.sign_in_vk);

        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WelcomeActivity1.class);
                startActivity(intent);
            }
        });

        mSignInTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WelcomeActivity1.class);
                startActivity(intent);
            }
        });
        mSignInFacebookTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WelcomeActivity1.class);
                startActivity(intent);
            }
        });
        mSignInGmailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WelcomeActivity1.class);
                startActivity(intent);
            }
        });
        mSignInVkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WelcomeActivity1.class);
                startActivity(intent);
            }
        });
        return rootView;
    }


}
