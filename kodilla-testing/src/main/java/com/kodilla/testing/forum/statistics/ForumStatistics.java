package com.kodilla.testing.forum.statistics;
import java.util.List;

public class ForumStatistics{

// metoda calculateAdvStatistics ma liczyć i wpisywać do pol klasy.
// A odczyt robisz getterami do poszczególnych statystyk

    Statistics statistics;
    double usersQuantity;
    double postsQuantity;
    double commentsQuantity;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.usersQuantity = statistics.userNames().size();
        this.postsQuantity = statistics.postCount();
        this.commentsQuantity = statistics.commentsCount();

        if(usersQuantity!=0){
            this.averagePostsPerUser = postsQuantity/usersQuantity;
            this.averageCommentsPerUser = commentsQuantity/usersQuantity;
        } else {
            this.averagePostsPerUser = 0;
            this.averageCommentsPerUser = 0;
        }

//jeśli liczba postów = 0 to średnia liczba postów = 0
        if(postsQuantity !=0){
            this.averageCommentsPerPost = commentsQuantity/postsQuantity;
        } else {
            this.averageCommentsPerPost = 0;
        }
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public double getUsersQuantity() {
        return usersQuantity;
    }

    public double getPostsQuantity() {
        return postsQuantity;
    }

    public double getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
    public void showStatistics() {
        System.out.println("Statistics:\n"
                + "User count = " + usersQuantity + "\n"
                + "Post count = " + postsQuantity + "\n"
                + "Comment count = " + commentsQuantity + "\n"
                + "Average posts per user = " + averagePostsPerUser + "\n"
                + "Average comments per user = " + averageCommentsPerUser + "\n"
                + "Average comments per post = " + averageCommentsPerPost);
    }
}
