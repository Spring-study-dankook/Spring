package com.dku.springstudy.model;

public class Board {

    private Genre genre;
    private String title;
    private String content;

    public Board(String genre, String title, String content) {

        if(!Genre.isExistGenre(genre)) {
            return;
        }

        this.genre = Genre.valueOf(genre);
        this.title = title;
        this.content = content;
    }

    /*
    public static boolean isBoardNull(Board board) {
        if(board.getGenre() == null) {
            if(board.getTitle() == null) {
                if(board.getContent() == null) {
                    return true;
                }
            }
        }

        return false;
    }
    */

    public Genre getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
