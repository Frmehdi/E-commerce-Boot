package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.LigneCommande;

public interface ILigneCommandeRepository extends JpaRepository<LigneCommande,Long>{

}
