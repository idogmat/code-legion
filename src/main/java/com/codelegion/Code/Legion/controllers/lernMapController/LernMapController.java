package com.codelegion.Code.Legion.controllers.lernMapController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LernMapController {
    @GetMapping("/learn")
    public String learn() {
        String result;
        String tokenAvtorization = "NOTNULL"; //
        if (tokenAvtorization == null) {
            result = "login";
        } else {
            //todo полученеие данных из бд учебных материалов
            result = "learn";
        }
        return result;
    }

    //todo получение массива на материалы
    //todo получение массива инструкций
    //todo получение массива на лекции
}
