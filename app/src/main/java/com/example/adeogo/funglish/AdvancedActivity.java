package com.example.adeogo.funglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.adeogo.funglish.R;
import com.example.adeogo.funglish.adapters.AdvancedAdapter;
import com.example.adeogo.funglish.adapters.HorizontalAdapter;
import com.example.adeogo.funglish.models.Lesson;
import com.example.adeogo.funglish.models.Level;

import java.util.ArrayList;
import java.util.List;

public class AdvancedActivity extends AppCompatActivity implements AdvancedAdapter.AdvancedAdapterOnclickHandler {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private AdvancedAdapter mAdapter;
    private List<Lesson> mLessonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Advanced");

        mRecyclerView = (RecyclerView) findViewById(R.id.lesson_rv);
        mAdapter = new AdvancedAdapter(this,this);
        mLayoutManager = new LinearLayoutManager(this);
        setData();
        mAdapter.swapData(mLessonList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }

    private void setData() {
        mLessonList = new ArrayList<>();
        mLessonList.add(new Lesson("LESSON 1", true, "Talks about the Past, Present and Future"));
        mLessonList.add(new Lesson("LESSON 2", true, "Cultural Differences and Useful Phrases"));
        mLessonList.add(new Lesson("LESSON 3", true, "Classifying Functions"));
        mLessonList.add(new Lesson("LESSON 4", true, "Synonyms"));
        mLessonList.add(new Lesson("LESSON 5", true, "Synonyms"));
        mLessonList.add(new Lesson("LESSON 6", true, "Passives"));
        mLessonList.add(new Lesson("LESSON 7", false, "Synonyms"));
        mLessonList.add(new Lesson("LESSON 8", true, "Synonyms"));
        mLessonList.add(new Lesson("LESSON 9", true, "Synonyms"));
        mLessonList.add(new Lesson("LESSON 10", false, "Comparing and Contrasting"));
    }

    @Override
    public void voidMethod(List<Lesson> lessonList, int adapterPosition) {
        Intent intent = new Intent(AdvancedActivity.this, Lesson10Activity.class);
        startActivity(intent);
    }
}
