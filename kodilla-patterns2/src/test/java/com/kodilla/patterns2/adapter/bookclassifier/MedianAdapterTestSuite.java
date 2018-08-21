package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("author1", "title1", 1954, "signature1");
        Book book2 = new Book("author2", "title2", 1922, "signature2");
        Book book3 = new Book("author3", "title3", 2008, "signature3");
        Book book4 = new Book("author4", "title4", 1961, "signature4");
        Book book5 = new Book("author5", "title5", 2012, "signature5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);
        int publicationYearAverage = medianAdapter.publicationYearAverage(bookSet);

        //Then
        System.out.println("Median: " + publicationYearMedian);
        System.out.println("Average: " + publicationYearAverage);
        assertEquals(1961, publicationYearMedian, 0);
        assertEquals(1971, publicationYearAverage, 0);
    }
}
