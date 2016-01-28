package com.metier;

import com.dao.IRoleRepository;
import com.dao.IUserRepository;
import com.entities.Client;
import com.entities.Commande;
import com.entities.Panier;
import com.entities.Role;
import com.entities.User;

public class UserMetierImpl implements UserMetier{

	
	private IUserRepository userrepository;
	private IRoleRepository rolerepository;
	@Override
	public User ajouterUser(User u) {
		return userrepository.save(u);
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		User u = userrepository.findOne(userID);
		u.getRoles().add(r);
		rolerepository.save(r);
	}

	
}
