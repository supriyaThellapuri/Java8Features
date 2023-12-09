package org.example.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbersAndCountRemainingNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers are :" + " " +evenNumbers);
        System.out.println("-------------------------------------------------------");


        List<Integer> oddNumbers = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers are :" + " " +oddNumbers);
        System.out.println("-------------------------------------------------------");

        Integer even_count = list.size() - oddNumbers.size();
        System.out.println("Even Elements of list count is : " + " " + even_count);
        System.out.println("-------------------------------------------------------");


        Integer odd_count = list.size() - evenNumbers.size();
       System.out.println("Odd Elements of list count is : " + " " + odd_count);
    }
}
