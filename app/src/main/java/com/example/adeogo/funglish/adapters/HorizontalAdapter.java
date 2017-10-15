package com.example.adeogo.funglish.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.adeogo.funglish.R;
import com.example.adeogo.funglish.models.Level;

import java.util.List;

/**
 * Created by Adeogo on 10/14/2017.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context mContext;
    private List<Level> mLevelList = null;

    private final LevelAdapterOnclickHandler mClickHandler;


    public interface LevelAdapterOnclickHandler{
        void voidMethod(List<Level> levelList, int adapterPosition);
    }

    public HorizontalAdapter(Context context, LevelAdapterOnclickHandler levelAdapterOnclickHandler){
        mContext = context;
        mClickHandler = levelAdapterOnclickHandler;
    }


    public class LevelAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView mTitleTextView;
        public final TextView mLessonsTextView;
        public final TextView mPercentageTextView;

        public LevelAdapterViewHolder(View itemView) {
            super(itemView);
            mTitleTextView = (TextView) itemView.findViewById(R.id.level_title);
            mLessonsTextView = (TextView) itemView.findViewById(R.id.lesson_number_id);
            mPercentageTextView = itemView.findViewById(R.id.list_item_percentage);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();

            mClickHandler.voidMethod(mLevelList, adapterPosition);
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view  = layoutInflater.inflate(R.layout.list_item_profile, parent, false);
        return new LevelAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String Title = null;
        int Lessons = 0;
        int Percentage = 0;

        if(mLevelList != null){
            Level level = mLevelList.get(position);
            Title = level.getLevelTitle();
            Lessons = level.getLessonNumber();
            Percentage = level.getPercentageQuantity();
        }


        ((LevelAdapterViewHolder) holder).mTitleTextView.setText(Title);
        ((LevelAdapterViewHolder) holder).mLessonsTextView.setText(Integer.toString(Lessons));
        ((LevelAdapterViewHolder) holder).mPercentageTextView.setText(Integer.toString(Percentage));
    }


    @Override
    public int getItemCount() {
        if(null == mLevelList){
            return 0;
        }
        return mLevelList.size();
    }


    public List<Level> swapData(List<Level> level) {
        // check if this cursor is the same as the previous cursor (mCursor)
        if (level == mLevelList) {
            return null; // bc nothing has changed
        }
        List<Level> temp = mLevelList;
        this.mLevelList = level; // new cursor value assigned

        //check if this is a valid cursor, then update the cursor
        if (level != null) {
            this.notifyDataSetChanged();
        }
        return temp;
    }
}