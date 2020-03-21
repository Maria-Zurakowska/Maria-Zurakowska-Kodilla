package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When ->pobieram kolekcję książek z obiektu bookDirectory
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublishedAfter2007 = 0;
        for(Book book : books){ // iteruję po kolekcji książek
            if(book.getYearOfPublication() > 2007){
                numberOfBooksPublishedAfter2007++;
            }
        }
        //sprawdzam, czy takich książek było dokładnie 3, po 2007 r.
        Assert.assertEquals(3,numberOfBooksPublishedAfter2007);
    }
    @Test
    public void testGetListUsingStream(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
// tworzę strumień elementów int
        long numberOfBooksPublishedAfter2007 = IntStream.range(0,books.size())

// n- to wartość indeksu, filtruję te numery indeksów, które odpowiadają książkom po 2007
// wartość indeksu -> pobierz ten indeks, wyciągnij metodę, który odpowiada książkom po 2007
                .filter(n->books.get(n).getYearOfPublication() > 2007)
                .count(); // terminal

        Assert.assertEquals(3,numberOfBooksPublishedAfter2007);
    }
}
