package com.dku.springstudy.validator;

import com.dku.springstudy.model.Board;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BoardValidator {

    public boolean validate(Board board) {
        return Objects.nonNull(board.getType()) && Objects.nonNull(board.getTitle()) && Objects.nonNull(board.getContent());
    }
}
