package com.example.drivingtutorapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;
import java.util.List;


public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Quiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /*
    public static synchronized Database getInstance(Context context) {
        if (instance == null) {
            instance = new Database(context.getApplicationContext());
        }
        return instance;
    }


     */

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        /*final String SQL_CREATE_CATEGORIES_TABLE = "CREATE TABLE " +
                CategoriesTable.TABLE_NAME + "( " +
                CategoriesTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CategoriesTable.COLUMN_NAME + " TEXT " +
                ")";

         */


        //create a table in database
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +

                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);

        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    //import the questions to the table
    private void fillQuestionsTable() {
        Question q1 = new Question("To exit an interstate, you should use?", "an acceleration lane", "a deceleration lane", "an exit gore", "a merging lane", 2);
        addQuestion(q1);
        Question q2 = new Question("When you approach a stopped school bus with its red lights flashing on an undivided roadway, you must come to a complete stop and remain stopped until","The bus starts moving", "The red lights stop flashing", "The driver signals you to proceed", "any of the above happens",4);
        addQuestion(q2);
        Question q3 = new Question("A solid yellow line next to your lane means that", "You must not pass", "You must reduce your speed", "You must increase your speed", "You may pass",1);
        addQuestion(q3);
        Question q4 = new Question("If the rear of your vehicle starts to skid, turn the steering wheel", "In the opposite direction of the skid", "in the direction of the skid", "Toward the right", "Toward the left",2);
        addQuestion(q4);
        Question q5 = new Question("To keep a proper grip on the steering wheel, you should place", "Your left hand at 10 o'clock and your right hand at 2 o'clock.", "Your left hand at 9 o'clock and your right hand at 1 o'clock.", "Your left hand at 8 o'clock and your right hand at 4 o'clock.", "Your left hand at 11 o'clock and your right hand at 4 o'clock.",3);
        addQuestion(q5);
        Question q6 = new Question("How fast should you drive on an interstate?", "55 Mph" , "30 Mph", "70 Mph", "65 Mph",3);
        addQuestion(q6);
        Question q7 = new Question("If an emergency vehicle approaches you while sounding a siren and flashing warning lights, you must", "Stop wherever you are","Pull over to the right edge of the road", "Slow down","Pull over to the left edge of the road",2);
        addQuestion(q7);
        Question q8 = new Question("On interstate highways, slower vehicles should travel _________ except when passing.","In the left-hand lane","On the shoulder","In the middle lanes","In the right-hand lane",4);
        addQuestion(q8);
        Question q9 = new Question("When driving at night, you should use _________ whenever you are following another vehicle within 200 feet.","Emergency flashers","Fog lights","Low-beam headlights","High-beam headlights",3);
        addQuestion(q9);
        Question q10 = new Question("When you park or stop your vehicle on a grade facing downhill, which way should you point your front wheels?","Parallel to the curb","Toward the curb","Away from the curb","In any direction",2);
        addQuestion(q10);
        Question q11 = new Question("When you intend to make a turn, you must start to signal _________ before turning", "At least 100 feet","At least 70 feet","At least 25 feet","At least 50 feet",1);
        addQuestion(q11);
        Question q12 = new Question("At night, for better visibility in fog, rain, or snow, use your","low-beam headlights","high-beam headlights","emergency flashers","parking lights",1);
        addQuestion(q12);
        Question q13 = new Question("On interstate highways, do not drive slower than _______ unless driving conditions are hazardous or a lower speed limit has been posted", "45 mph", "25 mph","35 mph", "55 mph",4);
        addQuestion(q13);
        Question q14 = new Question("When two vehicles meet on a steep mountain road where neither can pass, which vehicle has the right-of-way?", "The vehicle that arrives first","The vehicle traveling uphill", "The vehicle traveling downhill", "Neither vehicle",2);
        addQuestion(q14);
        Question q15 = new Question("Which of the following statements about passing a vehicle is FALSE?", "You may exceed the speed limit to pass quickly","Do not follow another vehicle that is passing a car in front of you","Do not pass more than one vehicle at a time","Avoid passing on the right unless you can do it safely",1);
        addQuestion(q15);
        Question q16 = new Question("You should never drive alongside a motorcycle in the same lane because", "Motorcycles do not have signal lights","The motorcycle needs the full width of the lane","The motorcyclist might misguide you","Motor cyclists do not need to follow traffic rules", 2);
        addQuestion(q16);
        Question q17 = new Question("In a center left-turn lane, you should use","Extreme caution to make a right turn","A left signal to make a right turn","Emergency flashers to make a right turn","Extreme caution to make a left turn",4);
        addQuestion(q17);
        Question q18 = new Question("You may pass another vehicle if there is _________ next to your lane", "A double solid yellow line", "A broken white line", "A solid white line","A single solid yellow line",2);
        addQuestion(q18);
        Question q19 = new Question("If a pedestrian is in a marked or unmarked crosswalk, you must","Reduce your speed and proceed with caution", "Not stop","Stop and wait until the pedestrian has passed","Increase your speed and cross the crosswalk quickly",3);
        addQuestion(q19);
        Question q20 = new Question("The right lane on a freeway should remain open for ________ as much as possible","Heavy vehicles","Traffic entering or leaving the freeway","Through traffic","Passing traffic",2);
        addQuestion(q20);
        Question q21 = new Question("The likelihood of an accident increases if a driver is under the influence of","A cup of tea","Alcohol, illegal drugs, or prescription medications","Softly playing music","A cup of coffee",2);
        addQuestion(q21);
        Question q22 = new Question("In heavy rain, your tires can ride on a film of water and lose contact with the road. This hazard is known as","Rainplaning","Hydroplaning","Frictionplanning","Waterplaning",2);
        addQuestion(q22);
        Question q23 = new Question("Parking is prohibited in all of the following places EXCEPT","On the side of a street", "In an intersection", "In front of a private driveway","On a sidewalk",1);
        addQuestion(q23);
        Question q24 = new Question("When stopped behind another vehicle on a hill, you should stay back at least","One vehicle length", "Two vehicle lengths", "Three vehicle lengths","Four vehicle lengths",1);
        addQuestion(q24);
        Question q25 = new Question("The correct hand signal to indicate a left turn is","Hand and arm extended upward","Hand and arm extended downward","Hand and arm extended outward","Hand and arm extended backward",3);
        addQuestion(q25);

    }

    //syntax and name to import questions
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION1, question.getFirstChoice());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION2, question.getSecondChoice());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION3, question.getThirdChoice());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION4, question.getFourthChoice());

        cv.put(QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable.TABLE_NAME, null, cv);
    }

    //use array to suffle and put the questions in organized order
    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_QUESTION)));
                question.setFirstChoice(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION1)));
                question.setSecondChoice(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION2)));
                question.setThirdChoice(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION3)));
                question.setFourthChoice(c.getString(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_OPTION4)));

                question.setAnswerNr(c.getInt(c.getColumnIndex(QuizContract.QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}