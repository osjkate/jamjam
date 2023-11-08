package com.jam.hello.service;

import com.jam.hello.domain.Time;
import com.jam.hello.domain.User;
import com.jam.hello.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    public User beforeEach() {
        User user1 = new User(1L, "오수진", "1234", null, null, 10, true, 10, Time.ONE);
        User user2 = new User(2L, "김진영", "1234", null, null, 10, true, 10, Time.ONE);
        return userRepository.save(user1);
    }

    @Test
    void findAllTest() {
        List<User> allBefore = userRepository.findAll();
        int beforeSize = allBefore.size();
        beforeEach();
        List<User> allAfter = userRepository.findAll();
        assertThat(allAfter.size() - beforeSize).isEqualTo(1);
    }

    @Test
    void findByIdTest() {
        Optional<User> user = userRepository.findById(1L);
        assertThat(user.get().getUsername()).isEqualTo("오수진");
    }

}
