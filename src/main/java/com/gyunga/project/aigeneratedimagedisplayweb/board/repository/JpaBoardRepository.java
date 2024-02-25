package com.gyunga.project.aigeneratedimagedisplayweb.board.repository;

import com.gyunga.project.aigeneratedimagedisplayweb.board.entity.Board;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBoardRepository extends BoardRepository, JpaRepository<Board, Long> {

    @Override
    public Board save(Board board);
//    @Override
//    public void findById() {};
//    @Override
//    public void findAll() {};
}
