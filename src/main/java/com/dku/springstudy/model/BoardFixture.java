package com.dku.springstudy.model;

import java.util.Arrays;
import java.util.List;

public class BoardFixture {

    public static List<Board> boardList = Arrays.asList(
            new Board(Genre.LANGUAGE, "JAVA", "WTF"),
            new Board(Genre.LANGUAGE, "KOTLIN", "TREND"),
            new Board(Genre.LANGUAGE, "JAVASCRIPT", "SO HARD"),
            new Board(Genre.MUSIC, "Lauv", "Sims"),
            new Board(Genre.IDE, "JetBrains", "IntelliJ IDEA")
    );
}