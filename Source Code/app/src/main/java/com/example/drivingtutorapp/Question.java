package com.example.drivingtutorapp;

//encapsulation class for questions with set and get
public class Question {
    private String question;
    private String FirstChoice;
    private String SecondChoice;
    private String ThirdChoice;
    private String FourthChoice;
    private int answerNr;

    public Question() {
    }

    public Question(String question, String FirstChoice, String SecondChoice, String ThirdChoice, String FourthChoice, int answerNr) {
        this.question = question;
        this.FirstChoice = FirstChoice;
        this.SecondChoice = SecondChoice;
        this.ThirdChoice = ThirdChoice;
        this.FourthChoice = FourthChoice;
        this.answerNr = answerNr;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFirstChoice() {
        return FirstChoice;
    }

    public void setFirstChoice(String FirstChoice) {
        this.FirstChoice = FirstChoice;
    }

    public String getSecondChoice() {
        return SecondChoice;
    }

    public void setSecondChoice(String SecondChoice) {
        this.SecondChoice = SecondChoice;
    }

    public String getThirdChoice() {
        return ThirdChoice;
    }

    public void setThirdChoice(String ThirdChoice) {
        this.ThirdChoice = ThirdChoice;
    }

    public String getFourthChoice(){
        return  FourthChoice;
    }

    public void setFourthChoice(String FourthChoice){
        this.FourthChoice = FourthChoice;
    }

    public int getAnswerNr() {
        return answerNr;
    }

    public void setAnswerNr(int answerNr) {
        this.answerNr = answerNr;
    }
}