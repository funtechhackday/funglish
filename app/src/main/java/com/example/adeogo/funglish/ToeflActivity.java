package com.example.adeogo.funglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.adeogo.funglish.adapters.HorizontalAdapter;
import com.example.adeogo.funglish.adapters.ToeflAdapter;
import com.example.adeogo.funglish.models.Level;

import java.util.List;

public class ToeflActivity extends AppCompatActivity implements ToeflAdapter.ToeflAdapterOnclickHandler {

    private RecyclerView mRecyclerView;
    private GridLayoutManager mLayoutManager;
    private ToeflAdapter mAdapter;
    private List<Level> mLevelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toefl);

        mRecyclerView = (RecyclerView) findViewById(R.id.toefl_rv);
        mAdapter = new ToeflAdapter(this,this);
        mLayoutManager = new GridLayoutManager(this,4);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }

    @Override
    public void voidMethod(List<Integer> lessonList, int adapterPosition) {
        Toast.makeText(this, "Function not Set!", Toast.LENGTH_SHORT).show();
    }
}
