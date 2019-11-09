package com.dku.springstudy.controller;

import com.dku.springstudy.model.Board;
import com.dku.springstudy.model.BoardFixture;
import com.dku.springstudy.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Controller
public class BoardController {

    @Autowired
    BoardService service;

    @RequestMapping(path = "/board/all", method = RequestMethod.GET)
    public String getAllBoard(Model model) {

        if (Objects.isNull(BoardFixture.boardList)) {
            return "board_not_found";
        }

        model.addAttribute("title", "모든 게시물 보여주기");
        model.addAttribute("boardList", BoardFixture.boardList);

        return "board";
    }

    //parameter로 Genre와 String 중 고민 해보았는데, Genre 외 URI 입력에 대한 예외 처리를 위해 String으로 parameter를 받았습니다.
    @RequestMapping(path = "/board/{genre}", method = RequestMethod.GET)
    public String getBoardByGenre(Model model, @PathVariable(value = "genre", required = false) String genre) {

        List<Board> boardList = service.getAllBoardByGenre(genre);

        if (Objects.isNull(boardList)) {
            return "board_not_found";
        }

        model.addAttribute("title", "해당 장르 게시물 보여주기");
        model.addAttribute("boardList", boardList);

        return "board";
    }

    @RequestMapping(path = "/board/{genre}/{title}", method = RequestMethod.GET)
    public String getBoardByTitle(Model model,
                                  @PathVariable(value = "genre", required = false) String genre,
                                  @PathVariable(value = "title", required = false) String title) {

        Board board = service.getBoardByGenreAndTitle(genre, title);

        if (Objects.isNull(board)) {
            return "board_not_found";
        }

        model.addAttribute("boardList", Arrays.asList(board));

        return "board";
    }

    @RequestMapping(path = "/board", method = RequestMethod.POST)
    public String updateBoard(Model model, Board target) {
        Board board = service.updateBoard(target);

        if (Objects.isNull(board)) {
            return "board_not_found";
        }

        model.addAttribute("title", board.getTitle());
        model.addAttribute("content", board.getContent());

        return "board";
    }

    @RequestMapping(path = "/board")
}
