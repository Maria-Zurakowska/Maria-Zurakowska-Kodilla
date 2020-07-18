package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorsName;
    private int numberOfHomeworks;

    public Mentor(String mentorsName) {
        this.mentorsName = mentorsName;
    }

    @Override
    public void update(Student student) {
        System.out.println(mentorsName + ": New homework " + student.getStudentsName()
                + "\n" + " (total: " + student.getHomeworks().size() + " homeworks)");
        numberOfHomeworks++;
    }

    public String getStudentsName() {
        return mentorsName;
    }

    public int getNumberOfHomeworks() {
        return numberOfHomeworks;
    }
}
