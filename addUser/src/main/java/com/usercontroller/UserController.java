package com.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userRepository.UserRepository;

import UserService.UserService;
import addUserModel.AddUser;
@RestController

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
    public AddUser saveaddUser(@RequestBody AddUser addUser) {
		AddUser addUser2= userService.saveAddUser(addUser);

        return addUser2.saveaddUser(addUser);
	}
}
