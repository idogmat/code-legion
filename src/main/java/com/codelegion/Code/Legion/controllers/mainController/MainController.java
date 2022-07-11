package com.codelegion.Code.Legion.controllers.mainController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        return "pages/home";
    }
}
