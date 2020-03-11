package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <numbers.size() ; i++) {
            Integer number = numbers.get(i);
            if(number %2 == 0){
                result.add(number);
            }
        }
        return result;
    }
}
