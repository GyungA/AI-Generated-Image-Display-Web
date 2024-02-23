package com.gyunga.project.aigeneratedimagedisplayweb.board.repository;

import com.gyunga.project.aigeneratedimagedisplayweb.board.entity.Board;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class JpaBoardRepository implements BoardRepository {
    private final EntityManager em;

    public JpaBoardRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(Board board) {
        em.persist(board);
    };
    @Override
    public void findById() {};
    @Override
    public void findAll() {};
}
