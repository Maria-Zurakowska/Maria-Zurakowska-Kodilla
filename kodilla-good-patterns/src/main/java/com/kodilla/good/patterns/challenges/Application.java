package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        User user = new User("Kasia", "Nowak");

        LocalDateTime orderFrom = LocalDateTime.of(2020,04,30,11,0);
        LocalDateTime orderTo = LocalDateTime.of(2020,05,01,14,0);



    }
}
