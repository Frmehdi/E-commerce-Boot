package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.User;

public interface IUserRepository extends JpaRepository<User,Long> {

}
