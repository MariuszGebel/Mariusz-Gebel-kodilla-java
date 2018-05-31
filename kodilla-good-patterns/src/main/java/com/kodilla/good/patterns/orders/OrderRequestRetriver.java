package com.kodilla.good.patterns.orders;

import java.time.LocalDate;

public class OrderRequestRetriver {
    public OrderRequest retrieve(){
        Client client = new Client("John", "Smith");
        LocalDate orderDate = LocalDate.of(2018, 5, 30);
        return new OrderRequest(client, orderDate);
    }
}
