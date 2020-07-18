package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable{
    private final List<Observer> observers;
    private final List<String> homeworks;
    private final String studentsName;

    public Student(String studentsName) {
        homeworks = new ArrayList<>();
        observers = new ArrayList<>();
        this.studentsName = studentsName;
    }

    public void addHomework(String homework){
        homeworks.add(homework);
    }

    @Override
    public void registerStudent(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyMentors() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeStudent(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getStudentsName() {
        return studentsName;
    }
}
