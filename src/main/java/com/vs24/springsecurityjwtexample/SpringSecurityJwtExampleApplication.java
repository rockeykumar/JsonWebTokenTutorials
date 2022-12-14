package com.vs24.springsecurityjwtexample;

import com.vs24.springsecurityjwtexample.entity.User;
import com.vs24.springsecurityjwtexample.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101, "user1", "pass1", "test1@gmail.com"),
				new User(102, "user2", "pass1", "test2@gmail.com"),
				new User(103, "user3", "pass1", "test3@gmail.com"),
				new User(104, "user4", "pass1", "test4@gmail.com")
		).collect(Collectors.toList());

		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
	}

}
