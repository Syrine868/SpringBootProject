package tn.esprit.demo.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.demo.entity.User;

public interface IUserService {
	
public   List<User> retrieveAllUsers();
public	 User addUser(User u);
public	 void deleteUser(String id);
public   Optional<User> retrieveUser(String id);
public   User updateUser(User u);
}
