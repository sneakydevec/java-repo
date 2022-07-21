package com.api.arctindev.model;

import java.util.*;

public class Article {

    private String id = UUID.randomUUID().toString();
	private String title = "Default Title!";
    private String text = "Default Text!";
    private String author = "Unknown";

    public Article() {}

	public Article(String title) {
        this.title = title;
	}

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
	}

    public Article(String title, String text, String author) {
        this.title = title;
        this.text = text;
        this.author = author;
	}

    public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

    public String getText() {
		return text;
	}

    public String getAuthor() {
		return author;
	}

    public String toString() {
        return "ID: " + id + "\n" +
               "Title: " + title + "\n" +
               "Text: " + text + "\n" +
               "Author: " + author + "\n";
    }
}
