package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Role;

public interface IRoleRepository extends JpaRepository<Role,Long>{

}
