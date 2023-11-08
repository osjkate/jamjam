package com.jam.hello.service;

import com.jam.hello.domain.Time;
import com.jam.hello.domain.User;
import com.jam.hello.dto.UserDto;
import com.jam.hello.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    //회원 가입
    public User signup(String username, String password, int salary,
                        boolean child_plan, int commute_time, Time preferred_time) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSalary(salary);
        user.setChild_plan(child_plan);
        user.setCommute_time(commute_time);
        user.setPreferred_time(preferred_time);
        return user;
    }

    // 로그인

    // 모든 회원 조회
    public List<UserDto.UserInfoResponse> getAllUserInfo() {
        return userRepository.findAll().stream()
                .map(UserDto.UserInfoResponse::of)
                .collect(Collectors.toList());
    }

    // ID로 회원 조회
    public UserDto.UserInfoResponse getUserInfoById(Long userId) {
        return userRepository.findById(userId)
                .map(UserDto.UserInfoResponse::of)
                .orElseThrow(() -> new IllegalArgumentException("회원 아이디가 올바르지 않습니다"));
    }

    //회원 정보 수정

    // 회원 탈퇴
}
