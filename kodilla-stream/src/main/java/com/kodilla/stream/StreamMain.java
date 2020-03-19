package com.kodilla.stream;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();
// Integer -userId, String - username
        Map<Integer,ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                    .filter(forumUser -> forumUser.getSex() == 'M')
                    .filter(forumUser -> 2020 - forumUser.getBirthdate().getYear() >=20)
                    .filter(forumUser -> forumUser.getNumberOfPosts() >=1)
                    .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
