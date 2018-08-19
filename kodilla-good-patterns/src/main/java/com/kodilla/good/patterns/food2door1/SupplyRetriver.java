package com.kodilla.good.patterns.food2door1;

public class SupplyRetriver {
    public SupplyRequest retrieveSupply() {
        String supplierName = "GlutenFreeShop";
        String productName = "Vegan Tofu";
        int productQuantity = 3000;

        return new SupplyRequest(supplierName, productName, productQuantity);
    }
}
