package com.dku.springstudy.model;

import org.assertj.core.util.Lists;

import java.util.List;

public class BoardFixture {

    public static List<Board> boardList = Lists.newArrayList(
            new Board("LANGUAGE", "JAVA", "WTF"),
            new Board("LANGUAGE", "JAVASCRIPT", "SO HARD"),
            new Board("MUSIC", "Lauv", "Sims"),
            new Board("IDE", "JetBrains", "IntelliJ IDEA"),
            new Board("LANGUAGE", "KOTLIN", "TREND")
            );
}