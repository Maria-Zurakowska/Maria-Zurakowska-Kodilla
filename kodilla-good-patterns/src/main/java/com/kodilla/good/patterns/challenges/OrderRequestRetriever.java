package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Kasia","Nowak");

        LocalDateTime orderFrom = LocalDateTime.of(2020,04,30,11,0);
        LocalDateTime orderTo = LocalDateTime.of(2020,05,01,14,0);

        return new OrderRequest(user,orderFrom,orderTo);

    }
}
