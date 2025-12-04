package org.example;

public class Book {
    private String istbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private String borrowedBy;

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setBorrowedBy(String borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    public String getIstbn() {
        return istbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String istbn, String title, String author) {
        this.istbn = istbn;
        this.title = title;
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "istbn='" + istbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                ", borrowedBy='" + borrowedBy + '\'' +
                '}';
    }
}
