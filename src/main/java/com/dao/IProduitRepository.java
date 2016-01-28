package com.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit,Long> {
	@Query("select p from Produit p where p.designation like :x or p.description like :x")
public Page<Produit> getProduitmc(@Param("x") String code,Pageable page);
	
	
	
	@Query("select p from Produit p where p.categorie.idcategorie=:x")
	public Page<Produit> getProduitCat(@Param("x") Long code,Pageable page);
	
	@Query("select p from Produit p where p.selected=true")
	public Page<Produit> getProduitSelec();
}
