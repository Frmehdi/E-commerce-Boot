package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Commande;

public interface ICommandeRepository extends JpaRepository<Commande,Long> {

}
