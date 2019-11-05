package com.dku.springstudy.model;

import com.dku.springstudy.type.BoardType;

public class Board {

    private BoardType type;
    private String title;
    private String content;

    public Board(BoardType type, String title, String content) {
        this.type = type;
        this.title = title;
        this.content = content;
    }

    public BoardType getType() {
        return type;
    }

    public void setType(BoardType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
