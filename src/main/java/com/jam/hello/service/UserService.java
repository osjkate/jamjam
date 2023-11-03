package com.jam.hello.service;

import com.jam.hello.domain.User;
import com.jam.hello.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public List<User> getList() {
        return this.userRepository.findAll();
    }
}
