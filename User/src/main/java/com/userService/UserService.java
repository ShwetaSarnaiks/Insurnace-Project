package com.userService;

import org.springframework.stereotype.Service;

import com.model.User;
import com.userRepository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	public User saveUserIntoDb(User user) {
		return userRepository.save(user);
		
	}

}
