package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

//        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is example text.");
        processor.execute(codeToExecute);

        /* lub zamiast 2 ostatnich linijek: */
        processor.execute(() -> System.out.println("This is example text."));

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println();
        System.out.println("Beautiful poem");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text to beautify", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Text to beautify", text -> text.toUpperCase());
        poemBeautifier.beautify("Text To Beautify", text -> text.toLowerCase());
        poemBeautifier.beautify("Text to beautify", text -> text.replace("to beautify", "is not beautiful"));


        System.out.println();
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

   }
}
