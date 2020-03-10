package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("TheForumUser");
        Calculator calc = new Calculator();

        String result = simpleUser.getUsername();

        if(result.equals("TheForumUser")){
            System.out.println("test ok");
        } else {
            System.out.println("Error !");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        int sum = calc.add(5,10);
        int subtraction = calc.subtract(10,5);

        if (sum == 15){
            System.out.println("Jest ok");
        } else {
            System.out.println("Nie jest ok");
        }

        if (subtraction == 5){
            System.out.println("Jest ok");
        } else {
            System.out.println("Nie jest ok.");
        }

    }
}
