package com.dku.springstudy.controller;

import com.dku.springstudy.model.Board;
import com.dku.springstudy.service.BoardService;
import com.dku.springstudy.type.BoardType;
import com.dku.springstudy.validator.BoardValidator;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @Autowired
    BoardValidator boardValidator;

    @GetMapping("/boards")
    public String getBoards(Model model, @RequestParam BoardType type, @RequestParam(required = false) String title) {
        List<Board> boards = boardService.getBoards(type, title);

        if (CollectionUtils.isEmpty(boards)) {
            return "boardNotFound";
        }

        model.addAttribute("boards", boards);

        return "boards";
    }

    @PostMapping("/boards")
    public String addBoard(Model model, Board sourceBoard) {
        if (!boardValidator.validate(sourceBoard)) {
            return "boardNotFound";
        }

        Board board = boardService.addBoard(sourceBoard);

        model.addAttribute("boards", Lists.newArrayList(board));

        return "boards";
    }

}
