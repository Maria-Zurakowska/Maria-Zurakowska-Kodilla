package com.kodilla.patterns.strategy.social;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("John Smith");
        User user2 = new ZGeneration("Kate Hudson");
        User user3 = new YGeneration("Mike Benton");

        //When
        String user1Shared = user1.sharePost();
        System.out.println("User1 shared: " + user1Shared);
        String user2Shared = user2.sharePost();
        System.out.println("User2 shared: " + user2Shared);
        String user3Shared = user3.sharePost();
        System.out.println("User3 shared: " + user3Shared);


        //Then
        Assert.assertEquals("You are using Facebook", user1Shared);
        Assert.assertEquals("You are using Twitter", user2Shared);
        Assert.assertEquals("You are using Snapchat", user3Shared);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("John Smith");

        //When
        String user1Shared = user1.sharePost();
        System.out.println("User1 shared: " + user1Shared);
        user1.setSocialPublisher(new SnapchatPublisher());
        user1Shared = user1.sharePost();
        System.out.println("User1 now shared: " + user1Shared);

        //Then
        Assert.assertEquals("You are using Snapchat", user1Shared);
    }
}
