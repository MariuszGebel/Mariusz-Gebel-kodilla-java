package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for(Book book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book book1 =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(),
                            book.getTitle(), book.getPublicationYear());
            books.put(bookSignature, book1);
        }
        return medianPublicationYear(books);
    }

    @Override
    public int publicationYearAverage(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for(Book book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book book1 =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(),
                            book.getTitle(), book.getPublicationYear());
            books.put(bookSignature, book1);
        }
        return averagePublicationYear(books);
    }
}
