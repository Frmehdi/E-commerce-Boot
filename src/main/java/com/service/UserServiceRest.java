package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Role;
import com.entities.User;
import com.metier.UserMetier;

@RestController
public class UserServiceRest {
	@Autowired
	private UserMetier userMetier;
	@RequestMapping(value="User/users")
	public User ajouterUser(@RequestBody User u) {
		return userMetier.ajouterUser(u);
	}
	@RequestMapping(value="/findUsers")
	public List<User> findAll() {
		return userMetier.findAll();
	}
	@RequestMapping(value="/addRole")
	public Role saveRole(@RequestBody Role r) {
		return userMetier.saveRole(r);
	}
	@RequestMapping(value="/findRoles")
	public List<Role> findRoles() {
		return userMetier.findRoles();
	}
	@RequestMapping(value="/addRoleToUser")
	public User addRoleToUser(@RequestParam Long id,@RequestParam Long idr) {
		return userMetier.addRoleToUser(id, idr);
	}


}
