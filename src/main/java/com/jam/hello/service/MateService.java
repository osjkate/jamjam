package com.jam.hello.service;

import com.jam.hello.domain.Mate;
import com.jam.hello.domain.User;
import com.jam.hello.repository.MateRepository;
import com.jam.hello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MateService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MateRepository mateRepository;

    // 메이트 만들기
    public Mate makeMate(Long user1_id, Long user2_id) {
        Optional<User> user1 = userRepository.findById(user1_id);
        Optional<User> user2 = userRepository.findById(user2_id);
        Mate mate = new Mate(1L, user1.get(), user2.get());
        return mateRepository.save(mate);
    }
    // 메이트끼리 일 나누기

    // 계약서
}
