package com.example.adeogo.funglish.models;

import java.lang.ref.SoftReference;

/**
 * Created by Adeogo on 10/15/2017.
 */

public class Lesson {
    private String LessonTitle;
    private boolean LessonDone;
    private String LessonDetail;

    public Lesson(String lessonTitle, boolean lessonDone, String lessonDetail){
        LessonTitle = lessonTitle;
        LessonDone = lessonDone;
        LessonDetail = lessonDetail;
    }

    public void setLessonDetail(String lessonDetail) {
        LessonDetail = lessonDetail;
    }

    public void setLessonDone(boolean lessonDone) {
        LessonDone = lessonDone;
    }

    public void setLessonTitle(String lessonTitle) {
        LessonTitle = lessonTitle;
    }

    public String getLessonDetail() {
        return LessonDetail;
    }

    public String getLessonTitle() {
        return LessonTitle;
    }

    public boolean isLessonDone() {
        return LessonDone;
    }
}
