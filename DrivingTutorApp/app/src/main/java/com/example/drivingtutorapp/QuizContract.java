package com.example.drivingtutorapp;

import android.provider.BaseColumns;

public final class QuizContract {

    private QuizContract() {
    }

    //create name for each column in the table
    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "FirstChoice";
        public static final String COLUMN_OPTION2 = "SecondChoice";
        public static final String COLUMN_OPTION3 = "ThirdChoice";
        public static final String COLUMN_OPTION4 = "FourthChoice";
        public static final String COLUMN_ANSWER_NR = "answer_nr";
    }
}