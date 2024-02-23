package com.gyunga.project.aigeneratedimagedisplayweb.board.service;

import com.gyunga.project.aigeneratedimagedisplayweb.board.entity.Board;
import com.gyunga.project.aigeneratedimagedisplayweb.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BoardService {
    private final BoardRepository boardRepository;
    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Long create(Board board) {
        boardRepository.save(board);
        return board.getId();
    };

    public void get() {};

    public void update() {};

    public void delete() {};
}
