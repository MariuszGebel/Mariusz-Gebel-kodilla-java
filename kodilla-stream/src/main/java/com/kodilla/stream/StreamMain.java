package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

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

        System.out.println();
        System.out.println("PEOPLE");
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
        //lub
        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        //tylko te obiekty, które mają więcej niż 11 znaków
        System.out.println();
        People.getList().stream()
                .filter(a -> a.length() > 11)
                .forEach(System.out::println);

        //kaskadowe łączenie operacji na Stream
        System.out.println();
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') +2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);


        //Stream na kolekcjach z dowolnymi obiektami
        System.out.println();
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        //użycie Collectors.toList()
        System.out.println();
        System.out.println("Collectors.toList");
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements published later then 2005: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        //użycie Collectors.toMap()
        System.out.println();
        System.out.println("Collectors.toMap");
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements published later then 2005: " + theResultMapOfBooks.size());
            theResultMapOfBooks.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);

        //użycie Collectors.joining()
        System.out.println();
        System.out.println("Collectors.joining");
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        //zadanie 7.3
        System.out.println();
        System.out.println("Zadanie 7.3");
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers = forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >=20)
                .filter(forumUser -> forumUser.getPostsNumber() >=1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + resultMapOfUsers.size());
        resultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);







    }
}
