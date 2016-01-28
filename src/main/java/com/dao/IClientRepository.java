package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Client;

public interface IClientRepository extends JpaRepository<Client,Long>{

}
