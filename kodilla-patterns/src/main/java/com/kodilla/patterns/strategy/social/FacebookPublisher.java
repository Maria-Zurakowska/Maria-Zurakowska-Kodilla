package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        System.out.println("You are using Facebook");
        return "You are using Facebook";
    }
}
