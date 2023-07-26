package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
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
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0){
                fizzyBList.add("FizzBuzz");
            }else if(numbers.get(i) % 3 == 0){
                fizzyBList.add("Fizz");
            }else if(numbers.get(i) % 5 == 0){
                fizzyBList.add("Buzz");
            }else{
                fizzyBList.add(Integer.toString(numbers.get(i)));
            }
        }
        return fizzyBList;
    
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
        // throw new RuntimeException("Not implemented");
        
        // create arrayList of odd and even numbers
        List<Integer> oddArray = new ArrayList<Integer>();
        List<Integer> evenArray = new ArrayList<Integer>();
        
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                evenArray.add(i);
            }else{
                oddArray.add(i);
            }
        }

        // iterate throught the array lists to get the sum of each array
        int calculatedSumOfOdds = 0;
        int calculatedSumOfEvens = 0;
        
        for(int x : oddArray){
            calculatedSumOfOdds += x;
        }

        for (int y : evenArray){
            calculatedSumOfEvens += y;
        }

        // create a map
        Map<String, Integer>calculatedSumMap  = new HashMap<String, Integer>();
       
        calculatedSumMap.put("SumOfOdds", calculatedSumOfOdds);
        calculatedSumMap.put("SumOfEvens", calculatedSumOfEvens);
//  i: calculatedSumMap.keySet()){
            // return  calculatedSumMap.getKey() + "," + calculatedSumMap.getValue(i);
        //  for(Map.Entry<String, Integer> iterable : calculatedSumMap.entrySet());
         return calculatedSumMap;
        } 
        
    

//             calculatedSumMap.put(, Integer.parseInt(getName(calculatedSumOfEvens)));
//             calculatedSumMap.put("SumOfOdds", Integer.parseInt(getName(calculatedSumOfOdds)));

//            
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

    // }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        // throw new RuntimeException("Not implemented");
        ArrayList<Integer>reversedList = new ArrayList<Integer>();
        for(int i = 0; i < numbers.size(); i++){
            reversedList.add(numbers.get(i));
        }
        Collections.reverse(reversedList);
        return reversedList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
