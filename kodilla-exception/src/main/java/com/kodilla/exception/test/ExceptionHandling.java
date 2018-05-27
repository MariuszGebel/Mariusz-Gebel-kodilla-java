package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(0.6, 1.6);
            System.out.println("No exception found!");
        } catch (Exception e) {
            System.out.println("Exception found: " + e);
        } finally {
            System.out.println("\"probablyIWillThrowException()\" method was executed!");
        }
    }
}
