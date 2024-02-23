package com.gyunga.project.aigeneratedimagedisplayweb.board.repository;

import com.gyunga.project.aigeneratedimagedisplayweb.board.entity.Board;

public interface BoardRepository {
    void save(Board board);
    void findById();
    void findAll();
}
