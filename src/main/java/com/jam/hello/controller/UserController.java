package com.jam.hello.controller;

import com.jam.hello.controller.Response.BasicResponse;
import com.jam.hello.controller.Response.CommonResponse;
import com.jam.hello.domain.User;
import com.jam.hello.dto.UserDto;
import com.jam.hello.repository.UserRepository;
import com.jam.hello.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/User")
public class UserController {
    private final UserService userService;

    //회원 가입

    //로그인
//    @PostMapping(path = "/login")
//    public ResponseEntity<? extends BasicResponse> login(
//            @Valid
//    )

    // 전체 회원 조회
    @GetMapping(path = "/all")
    public ResponseEntity<? extends BasicResponse> findAllUser() {
        return ResponseEntity.ok()
                .body(new CommonResponse<List>(userService.getAllUserInfo()));
    }

    // id로 회원 조회
    @GetMapping(path = "/{user-id}")
    public ResponseEntity<? extends BasicResponse> findUserById(
            @PathVariable("user-id") Long id
    ) {
        return ResponseEntity.ok(
                new CommonResponse<UserDto.UserInfoResponse>(
                        userService.getUserInfoById(id)));
    }

    // 회원 정보 수정

    // 회원 탈퇴
}
