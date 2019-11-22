package com.dku.springstudy.model;

import org.assertj.core.util.Lists;

import java.util.List;

//BoardRepository라고 명시해야 한다.
//또한 @Repository 및 @Autowired 하여 사용한다.
public class BoardFixture {

    public static List<Board> boardList = Lists.newArrayList(
            new Board("LANGUAGE", "JAVA", "WTF"),
            new Board("LANGUAGE", "JAVASCRIPT", "SO HARD"),
            new Board("MUSIC", "Lauv", "Sims"),
            new Board("IDE", "JetBrains", "IntelliJ IDEA"),
            new Board("LANGUAGE", "KOTLIN", "TREND")
            );
}