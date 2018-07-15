package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        //CorporateCustomer sam w konstruktorze określa jaka
        //ma być jego strategia inwestycyjna (BalancedPredictor)
        this.buyPredictor = new BalancedPredictor();
    }
}
