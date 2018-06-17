package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //adding books to Library 1
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Book" + n, "Author" + n,
                        LocalDate.of(2000 + n, n, n))));

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library cloned (shallow)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library cloned (deep)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        Book book6 = new Book("Book6", "Author6", LocalDate.of(2006, 6, 6));
        library.getBooks().add(book6);

        //Then
        System.out.println(library);
        System.out.println();
        System.out.println(clonedLibrary);
        System.out.println();
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
