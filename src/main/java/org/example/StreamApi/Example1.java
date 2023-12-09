package org.example.StreamApi;


import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

      List<Integer> list = Arrays.asList(10,80,90,50,55,66,88,84,82,42,56,59,87,89);
      List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumbers);
    }
}
