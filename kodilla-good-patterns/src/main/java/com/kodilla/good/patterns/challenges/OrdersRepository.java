package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrdersRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime from, LocalDateTime to) {
        return false;
    }
}
