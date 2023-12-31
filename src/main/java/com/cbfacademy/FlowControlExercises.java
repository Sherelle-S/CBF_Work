package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        // throw new RuntimeException("Not implemented");
        List<String> fizzyBList = new ArrayList<>();
        for(int i = 0; i <= numbers.size(); i++){
            if(numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0){
                fizzyBList.add("FizzBuzz");
            }else if(numbers.get(i) % 3 == 0){
                fizzyBList.add("Fizz");
            }else if(numbers.get(i) % 5 == 0){
                fizzyBList.add("Buzz");
            }else{
                fizzyBList.add(Integer.toString(i));
            }
        }
        return fizzyBList;
    //     List<String> fizzyList = new ArrayList<>();
    //     for(int i = 1; i <= numbers.size(); i++){
    //         if(i % 3 == 0 && i % 5 == 0){
    //             fizzyList.add("FizzBuzz");
    //         }else if(i % 3 == 0){
    //             fizzyList.add("Fizz");
    //         }else if(i % 5 == 0){
    //             fizzyList.add("Buzz");
    //         }else{
    //             fizzyList.add(Integer.toString(i));
    //         }
    //     }
    //      return fizzyList;
    // }

    //  List<String> fizzyList = new ArrayList<>();
    //     for(int i = 1; i <= numbers.size(); i++){
    //         Integer el = numbers.get(i);
    //         if(el % 3 == 0 && el % 5 == 0){
    //             fizzyList.add("FizzBuzz");
    //         }else if(el % 3 == 0){
    //             fizzyList.add("Fizz");
    //         }else if(el % 5 == 0){
    //             fizzyList.add("Buzz");
    //         }else{
    //             fizzyList.add(el.toString(i));
    //         }
    //     }
    //      return fizzyList;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        // throw new RuntimeException("Not implemented");
        switch(number){
            case 1:
            return "January";
            case 2:
            return "Feburary";
            case 3:
            return "March";
            case 4:
            return "April";
            case 5:
            return "May";
            case 6: 
            return "June";
            case 7:
            return "July";
            case 8:
            return "August";
            case 9:
            return "September";
            case 10:
            return "October";
            case 11:
            return "November";
            case 12:
            return "December";
            default:
            return "Invalid month number";
        }
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
        // List<Integer> nums = new ArrayList<Integer>();
        // int calculatedSumOfOdds = 0;
        // int calculatedSumOfEvens = 0;
        // for(int i = 0; i <= 100; i++){
        //     nums.add(i);
        // }
        // for(int i = 0; i < nums.size(); i++){
        //     if(nums.get(i) % 2 == 0){
        //         calculatedSumOfEvens += nums.get(i);
        //     }else{
        //         calculatedSumOfOdds += nums.get(i);
        //     }
        // }
        // return calculatedSumOfOdds;
        // return calculatedSumOfEvens;
        // Map<String, Integer> myMap = new HashMap<>();
        // myMap.put("SumOfEvens", calculatedSumOfEvens);
        // myMap.put("SumOfOdds", calculatedSumOfOdds);

        // return myMap;

    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
