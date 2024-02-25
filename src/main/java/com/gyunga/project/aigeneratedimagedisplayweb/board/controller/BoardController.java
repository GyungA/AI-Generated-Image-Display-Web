package com.gyunga.project.aigeneratedimagedisplayweb.board.controller;

import com.gyunga.project.aigeneratedimagedisplayweb.board.entity.Board;
import com.gyunga.project.aigeneratedimagedisplayweb.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@EnableJpaAuditing
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("createBoard")
    public String createBoard(Model model) {
        model.addAttribute("page_name", "createBoard");
        return "board-create-and-update";
    }

    @PostMapping(value = "createBoard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createBoard(@RequestBody Board board) {
        boardService.create(board);
        return "board-create-and-update";
    }
    public void readBoard() {
        return;
    }
    public void updatedBoard() {
        return;
    }
    public void deletedBoard() {
        return;
    }
}
