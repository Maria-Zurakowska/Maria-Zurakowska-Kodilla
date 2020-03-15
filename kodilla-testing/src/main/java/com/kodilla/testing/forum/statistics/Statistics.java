package com.kodilla.testing.forum.statistics;
import java.util.List;

//tylko metody i mogą mieć różny typ zwracany

public interface Statistics {
    List<String> userNames(); //list of user names
    int postCount(); // total quantity of forum posts
    int commentsCount(); //total quantity of forum comments
}
