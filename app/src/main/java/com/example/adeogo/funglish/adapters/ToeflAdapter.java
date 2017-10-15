package com.example.adeogo.funglish.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.adeogo.funglish.R;
import com.example.adeogo.funglish.models.Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adeogo on 10/15/2017.
 */

public class ToeflAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context mContext;
    private List<Integer> mExamList = new ArrayList<>();

    private final ToeflAdapterOnclickHandler mClickHandler;


    public interface ToeflAdapterOnclickHandler {
        void voidMethod(List<Integer> lessonList, int adapterPosition);
    }

    public ToeflAdapter(Context context, ToeflAdapter.ToeflAdapterOnclickHandler toeflAdapterOnclickHandler){
        mContext = context;
        mClickHandler = toeflAdapterOnclickHandler;
        int i = 0;
        while (i<20){
            mExamList.add(1+i);
            i++;
        }

    }


    public class ToeflAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView mTitleTextView;

        public ToeflAdapterViewHolder(View itemView) {
            super(itemView);
            mTitleTextView = (TextView) itemView.findViewById(R.id.title_toefl);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();

            mClickHandler.voidMethod(mExamList, adapterPosition);
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view  = layoutInflater.inflate(R.layout.list_item_toefl, parent, false);
        return new ToeflAdapter.ToeflAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String Title = null;

        if(mContext != null){
            int integer = mExamList.get(position);
            Title = "EXAM\n" + integer;
        }


        ((ToeflAdapter.ToeflAdapterViewHolder) holder).mTitleTextView.setText(Title);

    }


    @Override
    public int getItemCount() {
        if(null == mExamList){
            return 0;
        }
        return mExamList.size();
    }


    public List<Integer> swapData(List<Integer> integers) {
        // check if this cursor is the same as the previous cursor (mCursor)
        if (integers == mExamList) {
            return null; // bc nothing has changed
        }
        List<Integer> temp = mExamList;
        this.mExamList = integers; // new cursor value assigned

        //check if this is a valid cursor, then update the cursor
        if (integers != null) {
            this.notifyDataSetChanged();
        }
        return temp;
    }
}