package tn.esprit.demo.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.demo.entity.User;
import tn.esprit.demo.service.IUserService;

@RestController
public class UserRestController {

	@Autowired
	IUserService ius;
	
	
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers(){
		List<User> list=ius.retrieveAllUsers();
		return list;
	}
	
	@GetMapping("/retrieve-user/{user-id}")
	@ResponseBody
	public Optional<User> retrieveUser(@PathVariable("user-id")String userId)
	{
		return ius.retrieveUser(userId);
	}
	
	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User u){
		User user= ius.addUser(u);
		return user;		
	}
	
	@DeleteMapping("/remove-user/{user-id}")
	@ResponseBody
	public void removeUser(@PathVariable("user-id") String userId) {
		
	 ius.deleteUser(userId);
	System.out.println("deleted");
	}
	
	@PutMapping("/modify-user")
	@ResponseBody
	public User modifyUser(@RequestBody User user) {
	//return us.updateUser(user);
		return ius.updateUser(user);
	}
	
	
}
