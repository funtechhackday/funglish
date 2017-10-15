package com.example.adeogo.funglish.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.adeogo.funglish.R;
import com.example.adeogo.funglish.models.Lesson;
import com.example.adeogo.funglish.models.Level;

import java.util.List;

/**
 * Created by Adeogo on 10/15/2017.
 */

public class AdvancedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context mContext;
    private List<Lesson> mLessonList = null;

    private final AdvancedAdapter.AdvancedAdapterOnclickHandler mClickHandler;


    public interface AdvancedAdapterOnclickHandler{
        void voidMethod(List<Lesson> lessonList, int adapterPosition);
    }

    public AdvancedAdapter(Context context, AdvancedAdapter.AdvancedAdapterOnclickHandler advancedAdapterOnclickHandler){
        mContext = context;
        mClickHandler = advancedAdapterOnclickHandler;
    }


    public class AdvancedAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView mTitleTextView;
        public final TextView mDetailTextView;
        public final CheckBox mPercentageCheckBox;

        public AdvancedAdapterViewHolder(View itemView) {
            super(itemView);
            mTitleTextView = (TextView) itemView.findViewById(R.id.lesson_title);
            mDetailTextView = (TextView) itemView.findViewById(R.id.lesson_detail);
            mPercentageCheckBox = itemView.findViewById(R.id.lesson_done);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();

            mClickHandler.voidMethod(mLessonList, adapterPosition);
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view  = layoutInflater.inflate(R.layout.list_item_advanced, parent, false);
        return new AdvancedAdapter.AdvancedAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String Title = null;
        String Detail = null;
        boolean Done = false;

        if(mLessonList != null){
            Lesson lesson = mLessonList.get(position);
            Title = lesson.getLessonTitle();
            Detail = lesson.getLessonDetail();
            Done = lesson.isLessonDone();
        }


        ((AdvancedAdapter.AdvancedAdapterViewHolder) holder).mTitleTextView.setText(Title);
        ((AdvancedAdapterViewHolder) holder).mDetailTextView.setText(Detail);
        ((AdvancedAdapterViewHolder) holder).mPercentageCheckBox.setChecked(Done);
    }


    @Override
    public int getItemCount() {
        if(null == mLessonList){
            return 0;
        }
        return mLessonList.size();
    }


    public List<Lesson> swapData(List<Lesson> lesson) {
        // check if this cursor is the same as the previous cursor (mCursor)
        if (lesson == mLessonList) {
            return null; // bc nothing has changed
        }
        List<Lesson> temp = mLessonList;
        this.mLessonList = lesson; // new cursor value assigned

        //check if this is a valid cursor, then update the cursor
        if (lesson != null) {
            this.notifyDataSetChanged();
        }
        return temp;
    }
}