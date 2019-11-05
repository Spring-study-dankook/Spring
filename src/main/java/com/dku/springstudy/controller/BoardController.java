package com.dku.springstudy.controller;

import com.dku.springstudy.model.Board;
import com.dku.springstudy.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Objects;

@Controller
public class BoardController {

    @Autowired
    BoardService service;

    @RequestMapping(path = "/board", method = RequestMethod.GET)
    public String getBoard(Model model, String title) {
        Board board = service.getBoard(title);

        if (Objects.isNull(board)) {
            return "board_not_found";
        }

        model.addAttribute("title", board.getTitle());
        model.addAttribute("content", board.getContent());

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

}
