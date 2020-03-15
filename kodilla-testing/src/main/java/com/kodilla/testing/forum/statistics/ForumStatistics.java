package com.kodilla.testing.forum.statistics;
import java.util.List;

public class ForumStatistics{

// metoda calculateAdvStatistics ma liczyć i wpisywać do pol klasy.
// A odczyt robisz getterami do poszczególnych statystyk

    Statistics statistics;
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.usersQuantity = statistics.userNames().size();
        this.postsQuantity = statistics.postCount();
        this.commentsQuantity = statistics.commentsCount();
        this.averagePostsPerUser = postsQuantity/usersQuantity;
        this.averageCommentsPerUser = commentsQuantity/usersQuantity;
        this.averageCommentsPerPost = commentsQuantity/postsQuantity;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
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
