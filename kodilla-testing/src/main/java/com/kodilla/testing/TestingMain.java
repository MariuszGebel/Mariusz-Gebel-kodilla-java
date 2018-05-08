package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        //System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("First test OK!");
        } else {
            System.out.println("First test ERROR!!");
        }

        Calculator calc = new Calculator();

        int calcResult = calc.add(3,5);
        if (calcResult == 8) {
            System.out.println("Adding OK!");
        } else {
            System.out.println("Adding ERROR!!");
        }

        calcResult = calc.subtact(5, 3);
        if (calcResult == 2) {
            System.out.println("Subtracting OK!");
        } else {
            System.out.println("Subtracting ERROR!!");
        }
    }
}
