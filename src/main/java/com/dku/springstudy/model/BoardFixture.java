package com.dku.springstudy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BoardFixture {

    private static List<Board> boardList;

    public static List<Board> getInstance() {

        if(Objects.isNull(boardList)) {

            boardList = new ArrayList<>();

            boardList.add(new Board("LANGUAGE", "JAVA", "WTF"));
            boardList.add(new Board("LANGUAGE", "JAVASCRIPT", "SO HARD"));
            boardList.add(new Board("MUSIC", "Lauv", "Sims"));
            boardList.add(new Board("IDE", "JetBrains", "IntelliJ IDEA"));
            boardList.add(new Board("LANGUAGE", "KOTLIN", "TREND"));
        }

        return boardList;
    }
}