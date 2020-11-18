package tn.esprit.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import tn.esprit.demo.entity.Role;
import tn.esprit.demo.entity.User;
import tn.esprit.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService{
	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserRepository userRepo;

	@Override
	public List<User> retrieveAllUsers() {
		List<User> users=(List<User>) userRepo.findAll();
		for (User user:users)
		{
			l.info("user: "+user);
		}
	return users;
	}

	@Override
	public User addUser(User u) {
		return userRepo.save(u);
	}

	@Override
	public void deleteUser(String id) {
		userRepo.deleteById(Long.parseLong(id));
	}

	@Override
	public User updateUser(User u) {	
		
	  return userRepo.save(u);
	  
	}

	@Override
	public Optional<User> retrieveUser(String id) {
		
		Optional<User> user = userRepo.findById(Long.parseLong(id));
		
		l.info("user : "+user);
		 return user;
		
	}

}
