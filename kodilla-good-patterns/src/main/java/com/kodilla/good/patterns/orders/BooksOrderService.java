package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public class BooksOrderService implements OrderService {
    @Override
    public boolean order(Client client, LocalDate orderDate) {
     return true;
    }
}
