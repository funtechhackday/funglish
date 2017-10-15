package com.example.adeogo.funglish.models;

/**
 * Created by Adeogo on 10/14/2017.
 */

public class Level {
    private String LevelTitle;
    private int LessonNumber;
    private int PercentageQuantity;

    public Level(String levelTitle, int lessonNumber, int percentageQuantity){
        LevelTitle = levelTitle;
        LessonNumber = lessonNumber;
        PercentageQuantity = percentageQuantity;
    }

    public int getLessonNumber() {
        return LessonNumber;
    }

    public int getPercentageQuantity() {
        return PercentageQuantity;
    }

    public String getLevelTitle() {
        return LevelTitle;
    }

    public void setLessonNumber(int lessonNumber) {
        LessonNumber = lessonNumber;
    }

    public void setLevelTitle(String levelTitle) {
        LevelTitle = levelTitle;
    }

    public void setPercentageQuantity(int percentageQuantity) {
        PercentageQuantity = percentageQuantity;
    }
}
