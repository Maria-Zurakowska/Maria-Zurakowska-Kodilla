package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    //gdy liczba postów = 0
    @Test
    public void testCalculateAdvStatisticsZeroPosts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            userNames.add("randomName randomSurname");
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(200,forumStatistics.getUsersQuantity(),0.001);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost(),0.001);
        Assert.assertEquals(0,forumStatistics.getAveragePostsPerUser(),0.01);
        Assert.assertEquals(5,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(0,forumStatistics.getPostsQuantity(),0.001);
        Assert.assertEquals(1000,forumStatistics.getCommentsQuantity(),0.001);



    }
    //gdy liczba postów = 1000
    @Test
    public void testCalculateAdvStatisticsThousandPosts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            userNames.add("randomName randomSurname");
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(33);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.033,forumStatistics.getAverageCommentsPerPost(),0.001);
        Assert.assertEquals(0.033,forumStatistics.getAverageCommentsPerPost(),0.001);
        Assert.assertEquals(5,forumStatistics.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(0.165,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(1000,forumStatistics.getPostsQuantity(),0.001);
        Assert.assertEquals(33.0,forumStatistics.getCommentsQuantity(),0.001);
    }
    //gdy liczba komentarzy = 0
    @Test
    public void testCalculateAdvStatisticsZeroComments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            userNames.add("randomName randomSurname");
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.0,forumStatistics.getAverageCommentsPerPost(),0.001);
        Assert.assertEquals(0.0, forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(0.1, forumStatistics.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(0.0,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(20.0,forumStatistics.getPostsQuantity(),0.001);
        Assert.assertEquals(0.0,forumStatistics.getCommentsQuantity(),0.001);
    }
    //gdy liczba komentarzy < liczba postów
    @Test
    public void testCalculateAdvStatisticsLessPostsThanComments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            userNames.add("randomName randomSurname");
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(130);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(6.5, forumStatistics.getAverageCommentsPerPost(),0.01);
        Assert.assertEquals(0.65,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(0.1, forumStatistics.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(0.65,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(20.0,forumStatistics.getPostsQuantity(),0.001);
        Assert.assertEquals(130.0,forumStatistics.getCommentsQuantity(),0.001);
    }
    //gdy liczba komentarzy > liczba postów
    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            userNames.add("randomName randomSurname");
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(),0.001);
        Assert.assertEquals(0.05,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(0.1, forumStatistics.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(0.05,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(20.0,forumStatistics.getPostsQuantity(),0.001);
        Assert.assertEquals(10.0,forumStatistics.getCommentsQuantity(),0.001);

    }
    //gdy liczba użytkowników = 0
    @Test
    public void testCalculateAdvStatisticsZeroUsers(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(40);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(25.0, forumStatistics.getAverageCommentsPerPost(),0.001);
        Assert.assertEquals(0.0,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(0.0,forumStatistics.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(0.0,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(40,forumStatistics.getPostsQuantity(),0.001);
        Assert.assertEquals(1000.0,forumStatistics.getCommentsQuantity(),0.001);
    }
    //gdy liczba użytkowników = 100
    @Test
    public void testCalculateAdvStatisticsHundredUsers(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userNames.add("randomName randomSurname");
        }
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.postCount()).thenReturn(400);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1.25,forumStatistics.getAverageCommentsPerPost(),0.001);
        Assert.assertEquals(5.0,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(4.0,forumStatistics.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(5.0,forumStatistics.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(400.0,forumStatistics.getPostsQuantity(),0.001);
        Assert.assertEquals(500.00,forumStatistics.getCommentsQuantity(),0.001);
    }
}
