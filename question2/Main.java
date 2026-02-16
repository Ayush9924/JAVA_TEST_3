package com.lpu.test3.question2;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("ISBN123", "JAVA", true);
        Book book2 = new Book("ISBN456", "Data ALGO", false);

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Total Available Books" + library.getTotalBooksCount());

        try {
            library.borrowBook("ISBN123");
            System.out.println("Book ISBN123 borrowed successfully.");
        } catch (BookNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        }

        System.out.println("Total Available Books: " + library.getTotalBooksCount());

        try {
            library.borrowBook("ISBN456");
        } catch (BookNotFoundException e) {
            System.out.println("Error " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.println("Total Available Books: " + library.getTotalBooksCount());

        try {
            library.borrowBook("ISBN999");
        } catch (BookNotFoundException e) {
            System.out.println("Error; " + e.getMessage());
        }

        System.out.println("Total Aval Books " + library.getTotalBooksCount());
    }
}
