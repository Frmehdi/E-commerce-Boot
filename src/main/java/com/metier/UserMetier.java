package com.metier;


import com.entities.Role;
import com.entities.User;

public interface UserMetier {

	public User ajouterUser(User u);
	public void attribuerRole(Role r,Long userID);
}
