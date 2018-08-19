package com.kodilla.good.patterns.food2door1;

import java.util.ArrayList;

public class HealthyShop implements Supplier {
    private ArrayList<String> healthyShopList;

    public HealthyShop() {
        healthyShopList = new ArrayList<>();
        healthyShopList.add("Vegan Tofu");
        healthyShopList.add("Salmon");
        healthyShopList.add("Soya Milk");
    }

    @Override
    public boolean process() {
        SupplyRetriver supplyRetriver = new SupplyRetriver();
        SupplyRequest supplyRequest = supplyRetriver.retrieveSupply();
        if (healthyShopList.contains(supplyRequest.getProductName())) {
            return true;
        } else {
            return false;
        }
    }
}
