package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;
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
    @Test
    public void testCalculateAdvStatistics(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.userNames().size()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUser();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerUser();
        Assert.assertEquals(20,averagePostsPerUser);
        Assert.assertEquals(6,averageCommentsPerUser);
        Assert.assertEquals(100, averageCommentsPerPost);
    }
}
