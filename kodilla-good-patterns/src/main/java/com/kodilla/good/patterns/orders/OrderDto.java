package com.kodilla.good.patterns.orders;

public class OrderDto {
    public Client client;
    public boolean isOrdered;

    public OrderDto(Client client, boolean isOrdered) {
        this.client = client;
        this.isOrdered = isOrdered;
    }

    public Client getClient() {
        return client;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
