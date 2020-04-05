package lesson15;

import java.io.Serializable;

public class Book implements Serializable {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "author: " + author + "title: " + title;
    }
}

