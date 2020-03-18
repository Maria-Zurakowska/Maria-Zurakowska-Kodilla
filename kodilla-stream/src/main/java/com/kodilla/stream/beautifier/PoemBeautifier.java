package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public static void beautify(String text1, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text1);
        System.out.println(result);
    }
}
