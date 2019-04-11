package com.example.abbyyfetchingapi.Model;

import com.google.gson.annotations.SerializedName;


public class Question {

    public String title;
    public String body;


    @SerializedName("question_id")
    public String questionId;

    @Override
    public String toString() {
        return "Question{" +
                "title='" + title + '\'' +
                '}';
    }
}
