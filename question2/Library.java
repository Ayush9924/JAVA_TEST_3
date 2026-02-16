package com.lpu.test3.question2;

import java.util.HashMap;

public class Library {

    private HashMap<String, Book> books = new HashMap<>();
    private int totalBooksCount;

    public Library() {
        totalBooksCount = 0;
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);

        if (book.isAvailable()) {
            totalBooksCount++;
        }
    }

    public void borrowBook(String isbn) throws BookNotFoundException {

        if (!books.containsKey(isbn)) {
            throw new BookNotFoundException("Book with ISBN " + isbn + " not found.");
        }

        Book book = books.get(isbn);

        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is already borrowed.");
        }

        book.setAvailable(false);
        totalBooksCount--;
    }

    public int getTotalBooksCount() {
        return totalBooksCount;
    }
}
