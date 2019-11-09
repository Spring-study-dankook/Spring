package com.dku.springstudy.model;

public class Board {


    private Genre genre;
    private String title;
    private String content;

    public Board(Genre genre, String title, String content) {
        this.genre = genre;
        this.title = title;
        this.content = content;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
