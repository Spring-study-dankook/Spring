package com.dku.springstudy.service;

import com.dku.springstudy.model.Board;
import com.dku.springstudy.model.BoardFixture;
import com.dku.springstudy.model.Genre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class BoardService {

    public List<Board> getAllBoardByGenre(String genre) {

        if(!Genre.isExistGenre(genre)) {
            return null;
        }

        List<Board> target = new ArrayList<>();

        for (Board board : BoardFixture.getInstance()) {
            if (board.getGenre().equals(Genre.valueOf(genre))) {
                target.add(board);
            }
        }

        return target;
    }

    public Board getBoardByGenreAndTitle(String genre, String title) {

        if(!Genre.isExistGenre(genre)) {
            return null;
        }

        for (Board board : BoardFixture.getInstance()) {
            if(board.getGenre().equals(Genre.valueOf(genre))) {
                if (board.getTitle().equals(title)) {
                    return board;
                }
            }
        }

        return null;
    }

    public Board updateBoard(Board target) {

        if(!Genre.isExistGenre(target.getGenre().toString())) {
            return null;
        }

        Board board = getBoardByGenreAndTitle(target.getGenre().toString(), target.getTitle());

        if(Objects.isNull(board)) {
            BoardFixture.getInstance().add(target);
            return target;
        }

        board.setContent(target.getContent());
        return board;
    }
}
