package com.dku.springstudy.service;

import com.dku.springstudy.model.BoardDataList;
import com.dku.springstudy.model.BoardType;
import org.springframework.stereotype.Service;

import javax.management.InstanceNotFoundException;

@Service
public class BoardService {

    public BoardType getBoardData(String title) throws InstanceNotFoundException {

        int length = BoardDataList.getInstance().size();

        for (int i = 0; i < length; i++) {
            BoardType data = BoardDataList.getInstance().get(i);

            if(data.getTitle().equals(title)) {
                return data;
            }
        }

        throw new InstanceNotFoundException();
    }

    public BoardType updateBoardData(BoardType requestBoardData, BoardType changedBoardData) throws InstanceNotFoundException {

        int length = BoardDataList.getInstance().size();

        for(int i = 0; i < length; i++) {
            BoardType data = BoardDataList.getInstance().get(i);

            if(requestBoardData.getTitle().equals(data.getTitle())) {
                if(requestBoardData.getContent().equals(data.getContent())) {
                    data.setTitle(changedBoardData.getTitle());
                    data.setContent(changedBoardData.getContent());

                    return data;
                }
            }
        }

        throw new InstanceNotFoundException();
    }
}
