package com.gyunga.project.aigeneratedimagedisplayweb.board.entity;

import com.gyunga.project.aigeneratedimagedisplayweb.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String password;
    private Long post_id;

//    @OneToMany
//    private Post post;
}
