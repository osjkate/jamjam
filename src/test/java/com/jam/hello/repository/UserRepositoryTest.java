package com.jam.hello.repository;

import com.jam.hello.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    void findAllTest() {
        List<User> all = this.userRepository.findAll();
        assertThat(all.size()).isEqualTo(3);
    }

    @Test
    void findByIdTest() {
        Optional<User> user = this.userRepository.findById(1L);
        assertThat(user.get().getUsername()).isEqualTo("오수진");
    }
}
