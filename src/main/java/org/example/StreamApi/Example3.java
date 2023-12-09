package org.example.StreamApi;

import java.util.Arrays;
import java.util.Map;

import java.util.stream.Collectors;
public class Example3 {
    public static void main(String[] args) {
        String sentence = "Undeniably the most prominent landmark of Hyderabad Charminar has rightly been called as Arc de Triomphe of the East";
        String[] words = sentence.split("\\s+");
        Map<String,Long> wordCount = Arrays.stream(words)
                .map(word ->word. replaceAll("[a-zA-Z]","").toLowerCase())
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        wordCount.forEach((word,count) -> System.out.println(word + " = " + count));

    }
}
