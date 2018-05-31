package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public class BooksOrderRepository implements OrderRepository {
    @Override
    public boolean createOrderRecord(Client client, LocalDate orderDate) {
        return true;
    }
}
