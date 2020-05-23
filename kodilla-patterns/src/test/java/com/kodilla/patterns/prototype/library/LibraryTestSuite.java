package com.kodilla.patterns.prototype.library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given
        Library lib = new Library("New Library");
        Set<Book> books = new HashSet<>();

        Book book1 = new Book("Wolf of the mountain", "Dylan Murphy", LocalDate.ofYearDay(2003,12));
        Book book2 = new Book("Slaves of dreams", "Phoebe Pearson",LocalDate.ofYearDay(2012,04));
        Book book3 = new Book("Obliteration of heaven","Morgan Walsh",LocalDate.ofYearDay(2001,02));
        Book book4 = new Book("Rejecting the night","Aimee Murphy",LocalDate.ofYearDay(2015,03));
        Book book5 = new Book("Gangsters and kings","Ryan Talley",LocalDate.ofYearDay(2007,06));

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Library clonedLibrary = null;
        try{
            clonedLibrary = lib.shallowCopy();
            clonedLibrary.setName("Test 1");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = lib.deepCopy();
            deepClonedLibrary.setName("Test 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        lib.getBooks().remove(book1);
        //Then
        System.out.println(lib);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(0,clonedLibrary.getBooks().size());
        Assert.assertEquals(0,deepClonedLibrary.getBooks().size());
    }
}
