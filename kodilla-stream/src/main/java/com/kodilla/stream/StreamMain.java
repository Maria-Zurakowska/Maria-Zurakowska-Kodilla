package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ładny ",(text1) -> text1 + "kot");
        poemBeautifier.beautify("piękny ",(text1) -> text1 +"dom");
        poemBeautifier.beautify("słoneczny ", (text1) -> text1 +"dzień");
        poemBeautifier.beautify("bezchmurne ", (text1) -> text1 + "niebo");

        poemBeautifier.beautify("ładny",(text1) -> text1.toUpperCase());
        poemBeautifier.beautify("DOM",(text1) -> text1.toLowerCase());






/*      --> Przykład z lekcji
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5,(a,b)->a+b);
        expressionExecutor.executeExpression(10,5,(a,b)->a-b);
        expressionExecutor.executeExpression(10,5,(a,b)->a*b);
        expressionExecutor.executeExpression(10,5,(a,b)->a/b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);
*/
    }

}
