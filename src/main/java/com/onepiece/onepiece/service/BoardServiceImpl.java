package com.onepiece.onepiece.service;

import com.onepiece.onepiece.dto.BoardDTO;
import com.onepiece.onepiece.dto.CodeDTO;
import com.onepiece.onepiece.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




    @Service //서비스임을 선언
    public class BoardServiceImpl implements BoardService{

        @Autowired //Mapper와 연결
        private BoardMapper boardMapper;

        @Override
        public List<BoardDTO> selectBoardList() throws Exception {
            // TODO Auto-generated method stub
            return boardMapper.selectBoardList();
        }

        @Override
        public BoardDTO getBoard(int CHAR_ID) throws Exception {
            return boardMapper.getBoard(CHAR_ID);
        }
    }

