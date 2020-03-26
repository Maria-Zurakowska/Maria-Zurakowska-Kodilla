package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "";

        try{
            result = secondChallenge.probablyIWillThrowException(3.0,1.5);
        } catch (Exception e) {

            System.out.println("coś " + e);

        } finally {
            System.out.println("Attempt...");
        }
        return;
    }

}
