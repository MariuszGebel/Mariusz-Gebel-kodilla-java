package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public interface OrderService {
    boolean order(Client client, LocalDate orderDate);
}
