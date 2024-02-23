package com.gyunga.project.aigeneratedimagedisplayweb.board.repository;

import com.gyunga.project.aigeneratedimagedisplayweb.board.entity.Board;
import org.springframework.stereotype.Repository;

@Repository
public class JpaBoardRepository implements BoardRepository {
    @Override
    public void save(Board board) {};
    @Override
    public void findById() {};
    @Override
    public void findAll() {};
}
