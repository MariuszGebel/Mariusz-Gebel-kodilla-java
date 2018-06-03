package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRequest();
        SupplyContractor supplyContractor = orderRequest.retriveSupply();

        OrderProcessor orderProcessor = new OrderProcessor(supplyContractor, orderRequest);
        orderProcessor.processSupply(supplyContractor);
    }
}
