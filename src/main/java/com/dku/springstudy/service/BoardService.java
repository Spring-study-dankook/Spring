package com.dku.springstudy.service;

import com.dku.springstudy.model.Board;
import com.dku.springstudy.model.BoardFixture;
import com.dku.springstudy.type.BoardType;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    public List<Board> getBoards(BoardType type, String title) {
        List<Board> boards = Lists.newArrayList();

        if (StringUtils.isBlank(title)) {
            for (Board board : BoardFixture.boardList) {
                if (board.getType() == type) {
                    boards.add(board);
                }
            }
        } else {
            for (Board board : BoardFixture.boardList) {
                if (board.getType() == type && StringUtils.equals(board.getTitle(), title)) {
                    boards.add(board);
                }
            }
        }

        return boards;
    }

    public Board addBoard(Board sourceBoard) {
        for (Board board : BoardFixture.boardList) {
            if (sourceBoard.getType() == board.getType() &&
                StringUtils.equals(sourceBoard.getTitle(), board.getTitle())) {
                board.setContent(sourceBoard.getContent());
                return sourceBoard;
            }
        }

        BoardFixture.boardList.add(sourceBoard);
        return sourceBoard;
    }

//    public boolean containsBoard(Board source) { }
}