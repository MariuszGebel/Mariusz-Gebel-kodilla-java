package com.kodilla.good.patterns.food2door1;

public class Application {
    public static void main(String[] args) {
        SupplyRetriver supplyRetriver = new SupplyRetriver();
        SupplyRequest supplyRequest = supplyRetriver.retrieveSupply();

        SupplyProcessor supplyProcessor = new SupplyProcessor(new HealthyShop(),
                new SupplyServiceInitiator());
        supplyProcessor.processSupply(supplyRequest);
    }
}
