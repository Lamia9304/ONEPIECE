package com.onepiece.onepiece.service;
import com.onepiece.onepiece.dto.BoardDTO;
import com.onepiece.onepiece.dto.CodeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {

    List<BoardDTO> selectBoardList() throws Exception;

        BoardDTO getBoard(int CHAR_ID) throws Exception;

}