package com.dku.springstudy.model;

import java.util.ArrayList;

public class BoardDataList {

    private static ArrayList<BoardType> boardList;

    public static ArrayList<BoardType> getInstance() {

        if(boardList == null) {
            boardList = new ArrayList<>();

            boardList.add(new BoardType("JAVA", "WTF"));
            boardList.add(new BoardType("KOTLIN", "TREND"));
            boardList.add(new BoardType("JAVASCRIPT", "SO HARD"));
        }

        return boardList;
    }
}
