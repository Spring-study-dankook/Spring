package com.dku.springstudy.service;

import com.dku.springstudy.model.Board;
import com.dku.springstudy.model.BoardFixture;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    public Board getBoard(String title) {
        for (Board board : BoardFixture.boardList) {
            if (board.getTitle().equals(title)) {
                return board;
            }
        }

        return null;
    }

    public Board updateBoard(Board target) {
        for (Board board : BoardFixture.boardList)
            if (board.getTitle().equals(target.getTitle())) {
                board.setTitle(target.getTitle());
                board.setContent(target.getContent());

                return board;
            }

        return null;
    }
}
