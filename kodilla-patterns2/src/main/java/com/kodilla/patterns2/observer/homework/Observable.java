package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface Observable {
    void registerStudent(com.kodilla.patterns2.observer.homework.Observer observer);
    void notifyMentors();
    void removeStudent(com.kodilla.patterns2.observer.homework.Observer observer);
}
