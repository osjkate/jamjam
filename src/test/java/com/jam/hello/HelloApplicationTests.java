package com.jam.hello;

import com.jam.hello.domain.User;
import com.jam.hello.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testJPA() {
		User user1 = new User();
		user1.setUsername("오수진");
		user1.setPassword("1234");
		this.userRepository.save(user1);

		User user2 = new User();
		user2.setUsername("까루");
		user2.setPassword("12345");
		this.userRepository.save(user2);
	}

}
