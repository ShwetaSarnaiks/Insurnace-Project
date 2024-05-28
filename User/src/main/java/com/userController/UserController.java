package com.userController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.userService.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	public ResponseEntity<User> saveUser(@RequestBody User user) {
	 User user1=userService.saveUserIntoDb(user);
	 return ResponseEntity.ok().body(user1);
	}
}
