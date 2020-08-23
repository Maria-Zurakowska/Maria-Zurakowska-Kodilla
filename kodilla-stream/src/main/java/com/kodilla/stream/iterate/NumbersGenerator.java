package com.kodilla.stream.iterate;

import java.util.stream.Stream;

public final class NumbersGenerator {
    public static void generateEven(int max){
// n to argument wejściowy(aktualna wartość obiektu w strumieniu
        Stream.iterate(1,n-> n +1)
                .limit(max)             //filtrowanie
                .filter(n-> n % 2 ==0)  //filtrowanie
                .forEach(System.out::println);
    }

}
