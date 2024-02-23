package com.gyunga.project.aigeneratedimagedisplayweb.board.service;

import com.gyunga.project.aigeneratedimagedisplayweb.board.entity.Board;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    public Long create(Board board) {
        return board.getId();
    };

    public void get() {};

    public void update() {};

    public void delete() {};
}
