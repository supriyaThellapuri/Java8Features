package org.example.Books;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<BookDetails> books = new ArrayList<>();
        books.add(new BookDetails(1234, "J.K Rowling", "Fantasy", "Harry Potter and the Philosopher's Stone",200));
        books.add(new BookDetails(1235, "The Power Of Mind", "Fantasy", "Harry Potter and the Chamber of Secrets",400));
        books.add(new BookDetails(1236, "the Atomic Habits", "Fantasy", "Harry Potter and the Prisoner of Azkaban",530));
        books.add(new BookDetails(1237, "The Alchemist", "Geetha", "Harry Potter and the Goblet of Fire",632));
        BookDetails mostExpensiveBook = books.stream().max(Comparator.comparingInt(BookDetails::getPrice)).orElse(null);

        if(mostExpensiveBook != null)
        {
            System.out.println("The most expensive book is :"+ mostExpensiveBook.getBookName());
            System.out.println("The price of the book is :"+mostExpensiveBook.getPrice()+"/-");
        }
        else
        {
            System.out.println("No book found");
        }
    }
}
