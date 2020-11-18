package tn.esprit.demo;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.demo.entity.Role;
import tn.esprit.demo.entity.User;
import tn.esprit.demo.service.IUserService;
import tn.esprit.demo.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootProjectApplicationTests {

	@Autowired
	IUserService iuser;
	@Test
	public void contextLoads() {
		User u= new User("Syrine","Jlassi",Role.CHEF_DEPARTEMENT,new Date());
		User u_id=new User(23);
	    iuser.retrieveAllUsers();
	    u_id.setDate(new Date());
	    u_id.setPrenom("Laribi");
	    u_id.setNom("Amin");
	    u_id.setRole(Role.CHEF_DEPARTEMENT);
	    iuser.updateUser(u_id);
		//  iuser.addUser(u);
       // 	l.info(u);
	  //    iuser.deleteUser("19");
	 //     iuser.retrieveUser("19");
		}

}
