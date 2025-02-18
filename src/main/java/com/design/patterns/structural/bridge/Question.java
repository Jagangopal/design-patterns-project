package com.design.patterns.structural.bridge;

public interface Question {
    public void nextQuestion();
    public void previousQuestion();
    public void newQuestion(String q);
    public void deleteQuestion(String q);
    public void displayQuestion();
    public void displayAllQuestions();
}
