package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User {
    private String name;

    public ZGeneration(String name){
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
