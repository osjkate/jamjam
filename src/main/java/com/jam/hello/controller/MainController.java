package com.jam.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/main")
    @ResponseBody
    public String index() {
        return "메인 화면입니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/user/list";
    }
}
