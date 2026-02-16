package com.lpu.test3.question2;

public class Book {
    private String isbn;
    private String title;
    private boolean isAvailable;

    public Book(String isbn, String title, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }
}
