package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    Display display;

    public Calculator(final Display display) {
        this.display = display;
    }
    public double add(double a, double b){
        double result = display.displayValue(a+b);
        return result;
    }
    public double sub(double a, double b){
        double result = display.displayValue(a-b);
        return result;
    }
    public double mul(double a, double b){
        if(a==0 || b ==0){
            System.out.println("The value cannot be 0");
        }
        double result = display.displayValue(a*b);
        return result;
    }
    public double div(double a, double b) {
        if (a == 0 || b == 0) {
            System.out.println("The value cannot be 0");
        }
        double result = display.displayValue(a/b);
        return result;
    }
}
