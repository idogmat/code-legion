package com.codelegion.Code.Legion.controllers.mainController;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/general")
    public String general(Model model) {
        return "general";
    }

//    @PostMapping("/general")
//    public void answerGeneral(Model model) {
//
//    }
//    @DeleteMapping("/general")
//    public void deleteGeneral(Model model) {
//
//    }
//    @PutMapping("/general")
//    public void correctAnswer(Model model) {
//
//    }
//    @PatchMapping("/general")
//    public void patchGeneral(Model model) {
//
//    }
}
