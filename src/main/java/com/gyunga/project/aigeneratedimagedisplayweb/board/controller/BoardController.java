package com.gyunga.project.aigeneratedimagedisplayweb.board.controller;

import com.gyunga.project.aigeneratedimagedisplayweb.board.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("createBoard")
    public String createBoard(Model model) {
        model.addAttribute("page_name", "createBoard");
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
