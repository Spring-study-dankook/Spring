package com.dku.springstudy.service;

import com.dku.springstudy.model.Board;
import com.dku.springstudy.model.BoardFixture;
import com.dku.springstudy.model.Genre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    public List<Board> getAllBoardByGenre(String genre) {

        if(!isExistGenre(genre)) {
            return null;
        }

        List<Board> target = new ArrayList<>();

        for (Board board : BoardFixture.boardList) {
            if (board.getGenre().equals(Genre.valueOf(genre))) {
                target.add(board);
            }
        }

        return target;
    }

    public Board getBoardByGenreAndTitle(String genre, String title) {

        if(!isExistGenre(genre)) {
            return null;
        }

        for (Board board : BoardFixture.boardList) {
            if(board.getGenre().equals(Genre.valueOf(genre))) {
                if (board.getTitle().equals(title)) {
                    return board;
                }
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



    private boolean isExistGenre(String target) {

        for (Genre genres : Genre.values()) {
            if(target.equals(genres.toString())) {
                return true;
            }
        }

        return false;
    }
}
