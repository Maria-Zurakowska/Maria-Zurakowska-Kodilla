package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MedianAdapterTestSuite {


    @Test
    public void publicationYearMedianTest(){

        //Given
        Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> books = new HashSet<>();
        Set<com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksSet = new HashSet<>();
        IntStream.range(0, 9).forEach(i -> {
            booksSet.add(new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("Author" + i, "Title" + i, 1991 + i));
            booksSet.add(new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book("Author" + i, "Title" + i, 1991 + i));
        });
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(0,result);
    }
}
