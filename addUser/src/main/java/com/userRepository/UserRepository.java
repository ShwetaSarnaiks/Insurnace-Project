package com.userRepository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import addUserModel.AddUser;

public interface UserRepository extends CrudRepository<AddUser,Serializable> {

}
