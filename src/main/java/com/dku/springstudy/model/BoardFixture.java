package com.dku.springstudy.model;

import java.util.Arrays;
import java.util.List;

public class BoardFixture {

    public static List<Board> boardList = Arrays.asList(
            new Board("JAVA", "WTF"),
            new Board("KOTLIN", "TREND"),
            new Board("JAVASCRIPT", "SO HARD")
    );
}