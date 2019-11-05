package com.dku.springstudy.model;

import com.dku.springstudy.type.BoardType;
import com.google.common.collect.Lists;

import java.util.List;

public class BoardFixture {

    public static List<Board> boardList = Lists.newArrayList(
            new Board(BoardType.LANGUAGE, "JAVA", "WTF"),
            new Board(BoardType.MUSIC, "Lauv", "Sims"),
            new Board(BoardType.IDE, "JetBrains", "IntelliJ IDEA")
    );
}