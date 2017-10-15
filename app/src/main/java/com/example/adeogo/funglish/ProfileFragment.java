package com.example.adeogo.funglish;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adeogo.funglish.adapters.HorizontalAdapter;
import com.example.adeogo.funglish.models.Level;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements HorizontalAdapter.LevelAdapterOnclickHandler {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private HorizontalAdapter mAdapter;
    private List<Level> mLevelList;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        mRecyclerView =  rootView.findViewById(R.id.profile_rv);
        mAdapter = new HorizontalAdapter(getContext(),this);
        mLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false);
        setData();
        mAdapter.swapData(mLevelList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);

        return rootView;
    }

    private void setData() {
        mLevelList = new ArrayList<>();
        mLevelList.add(new Level("Beginner", 10, 100));
        mLevelList.add(new Level("Intermediate", 10, 100));
        mLevelList.add(new Level("Upper Intermediate", 10, 100));
        mLevelList.add(new Level("Advanced", 10, 100));
        mLevelList.add(new Level("TOEFL", 10, 100));
    }

    @Override
    public void voidMethod(List<Level> levelList, int adapterPosition) {

        Intent intent = new Intent(getActivity(), AdvancedActivity.class);
        startActivity(intent);
    }
}
