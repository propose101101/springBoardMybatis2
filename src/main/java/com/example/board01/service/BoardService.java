package com.example.board01.service;

import com.example.board01.dto.BoardDTO;
import com.example.board01.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    public final BoardRepository boardRepository;
    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);

    }

    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }
}
