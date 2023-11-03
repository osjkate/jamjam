package com.jam.hello.controller;

import com.jam.hello.domain.User;
import com.jam.hello.repository.UserRepository;
import com.jam.hello.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;

    @GetMapping("/user/list")
    public String list(Model model) {
        List<User> userList = this.userService.getList();
        model.addAttribute("userList", userList);
        return "user_list";
    }
}
