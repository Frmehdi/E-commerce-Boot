package com.metier;

import java.util.List;

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
		// TODO Auto-generated method stub
		return userrepository.save(u);
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}
	@Override
	public Role saveRole(Role r) {
		// TODO Auto-generated method stub
		return rolerepository.save(r);
	}
	@Override
	public List<Role> findRoles() {
		// TODO Auto-generated method stub
		return rolerepository.findAll();
	}
	@Override
	public User addRoleToUser(Long id, Long idr) {
		User u=userrepository.findOne(id);
		Role r=rolerepository.findOne(idr);
		u.getRoles().add(r);
		userrepository.save(u);
		return u;
	}


	
}
