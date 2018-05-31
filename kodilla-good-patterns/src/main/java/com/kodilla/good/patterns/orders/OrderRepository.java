package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public interface OrderRepository {
    boolean createOrderRecord(Client client, LocalDate orderDate);
}
