package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries of Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());

      }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfBooks(15);
        List<Book> resultListOf40Books = generateListOfBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition(("FortyBooks"));

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n= 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());

    }

    @Test
    public void testListBooksInHandsOf0() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("John", "Smith", "91020400102");
        ArrayList<Book> booksBorrowed = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(booksBorrowed);

        //When
        List<Book> borrowedBooks0 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        System.out.println("Expected: 0");
        System.out.println("Actual:   " + borrowedBooks0.size());
        assertEquals(0, borrowedBooks0.size());
    }

    @Test
    public void testListBooksInHandsOf1() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("John", "Smith", "91020400102");
        ArrayList<Book> booksBorrowed = new ArrayList<>();
        booksBorrowed.add(new Book("Jakiś tytuł", "Jan Kowalski", 2000));
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(booksBorrowed);

        //When
        List<Book> borrowedBooks1 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        System.out.println("Expected: 1");
        System.out.println("Actual:   " + borrowedBooks1.size());
        assertEquals(1, borrowedBooks1.size());
    }

    @Test
    public void testListBooksInHandsOf5() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("John", "Smith", "91020400102");
        ArrayList<Book> booksBorrowed = new ArrayList<>();
        for(int n= 1; n <= 5; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            booksBorrowed.add(theBook);
        }
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(booksBorrowed);

        //When
        List<Book> borrowedBooks5 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        System.out.println("Expected: 5");
        System.out.println("Actual:   " + borrowedBooks5.size());
        assertEquals(5, borrowedBooks5.size());
    }
}
