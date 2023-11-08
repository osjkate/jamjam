package com.jam.hello.service;


import com.jam.hello.domain.Time;
import com.jam.hello.domain.User;
import com.jam.hello.domain.Work;
import com.jam.hello.repository.UserRepository;
import com.jam.hello.repository.work.WorkRepository;
import com.jam.hello.repository.workcustom.WorkCustomRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
public class WorkServiceTest {

    @Autowired
    private WorkRepository workRepository;

    @Autowired
    private WorkCustomRepository workCustomRepository;

    @Autowired
    private UserService userService;

    private UserRepository userRepository;


    @Test
    void findAllTest() {
        List<Work> all = workRepository.findAll();
    }


//    public Work beforeEach() {
//
//    }
//    @BeforeEach
//    void setUp() throws Exception {
//        userRepository.deleteAll();
//        User user1 = userService.signup("김진영", "1234", 10000,
//                true, 10, Time.ONE);
//        User user2 = userService.signup("박민주", "12345", 100000,
//                true, 10, Time.ONE);
//        userRepository.save(user1);
//        userRepository.save(user2);
//    }
}
