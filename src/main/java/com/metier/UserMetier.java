package com.metier;


import java.util.List;

import com.entities.Role;
import com.entities.User;

public interface UserMetier {

	public User ajouterUser(User u);

	public List<User> findAll();
	public Role saveRole(Role r);
	public List<Role> findRoles();
	public User addRoleToUser(Long id,Long idr);
}
