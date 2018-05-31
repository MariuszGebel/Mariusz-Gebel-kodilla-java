package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public class OrderRequest {
    private Client client;
    private LocalDate orderDate;

    public OrderRequest(Client client, LocalDate orderDate) {
        this.client = client;
        this.orderDate = orderDate;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order Request: {" +
                client +
                ", Order date: " + orderDate +
                '}';
    }
}
