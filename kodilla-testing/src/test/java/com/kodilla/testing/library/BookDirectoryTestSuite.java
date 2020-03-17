package com.kodilla.testing.library;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test //czy lista książek spełniających warunek wyszukiwania jest poprawna
    public void testListBooksWithConditionsReturnList(){
        //Given
// tworzymy mock (atrapę klasy) dla interfejsu LibraryDatabase
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        // ->instruujemy MOCK, jak ma się zachować, gdy wywołam metodę .listBooksWithCondition
        //na MOCKu wywołuję metodę, daję parametr Secret. Jeśli on będzie to zwracam listę książek
        //jeśli w liście są książki, które zaczynają się od słowa Secret to zwróc wtedy całą listę książek
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When -->wywołujemy metodę listBookWithCondition(String titleFragment) obiektu bookLibrary
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then --sprawdzamy, czy zwrócone zostały cztery tytuły książek (tyle właśnie przygotowaliśmy)
        assertEquals(4, theListOfBooks.size());
    }
//metoda, które generuje listę książek o dowolnej liczbie tytułów
    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity ; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test //czy liczba tytułów jest większa niż 20
    public void testListBooksWithConditionMoreThan20(){
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());

    }
    @Test //czy wyszukiwany fragment jest krótszy niż 3 znaki
    public void testListBooksWithConditionFragmentShorterThan3(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
// tworzę listę 10 książek
        List<Book> resultOf10Books = generateListOfNBooks(10);
//zwróć listę 10 książek (thenReturn(resultOf10Books), gdy wywołam metodę .listBooksWithCondition
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultOf10Books);

        //When -->wywołuję metodę z argumentem An
        List<Book> theListOf10Books = bookLibrary.listBooksWithCondition("An");

        //Then

// sprawdzam, czy lista jest pusta (0). Ma być pusta, gdy dł. ciągu znaku jest mniejsza niż trzy znaki
        assertEquals(0,theListOf10Books.size());
// sprawdzam, czy metoda .listBooksWith... na pewno nie została ani razu wywołana
        verify(libraryDatabaseMock,times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOf_0Books(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("A","B","C");
        List<Book> bookList = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(bookList);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(user);

        //Then
        Assert.assertEquals(0,result.size());
    }

    @Test
    public void testListBooksInHandsOf_1Books(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("A","B","C");
        List<Book> bookList = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(bookList);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(user);

        //Then
        Assert.assertEquals(1,result.size());
    }

    @Test
    public void testListBooksInHandsOf_5Books(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("A","B","C");
        List<Book> bookList = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(bookList);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(user);

        //Then
        Assert.assertEquals(5,result.size());
    }
}
