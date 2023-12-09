package org.example.StreamApi;

import java.util.Arrays;
import java.util.List;

public class OddNumbersUsingStreamApi {
    public static  void main(String[] args) {
        String[] words = {"one", "two", "three", "four", "five"};
        List<String> wordList = Arrays.asList(words);
        wordList.stream()
                .filter(s -> s.length() % 2 != 0)
                .forEach(s -> System.out.println(s));


    }
}
