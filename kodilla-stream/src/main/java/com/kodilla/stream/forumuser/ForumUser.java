package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthdate;
    private final int numberOfPosts;

    public ForumUser(final int userId, final String username, final char sex, final int numberOfPosts, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthdate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
