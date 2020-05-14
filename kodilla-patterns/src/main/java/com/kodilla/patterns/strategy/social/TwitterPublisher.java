package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        System.out.println("You are using Twitter");
        return "You are using Twitter";
    }
}
