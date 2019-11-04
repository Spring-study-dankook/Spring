package com.dku.springstudy.service;

import com.dku.springstudy.model.BoardTypeList;
import com.dku.springstudy.model.BoardType;
import org.springframework.stereotype.Service;

import javax.management.InstanceNotFoundException;
import java.util.ArrayList;

@Service
public class BoardService {

    public BoardType getBoardType(String title) throws InstanceNotFoundException {

        int length = BoardTypeList.getInstance().size();

        for (int i = 0; i < length; i++) {
            BoardType boardType = BoardTypeList.getInstance().get(i);

            if(boardType.getTitle().equals(title)) {
                return boardType;
            }
        }

        throw new InstanceNotFoundException();
    }

    public BoardType updateBoardType(BoardType updatedBoardData) throws InstanceNotFoundException {

        ArrayList<BoardType> boardTypeList = BoardTypeList.getInstance();
        int length = BoardTypeList.getInstance().size();

        for(int i = 0; i < length; i++) {
            if(boardTypeList.get(i).getTitle().equals(updatedBoardData.getTitle())) {
                    boardTypeList.get(i).setTitle(updatedBoardData.getTitle());
                    boardTypeList.get(i).setContent(updatedBoardData.getContent());

                    return boardTypeList.get(i);
            }
        }

        throw new InstanceNotFoundException();
    }
}
