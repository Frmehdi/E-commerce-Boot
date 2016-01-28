package com.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.entities.Produit;

public interface ProduitMetier {
	public Produit ajouterProduit(Produit p,Long idCat);
	public List<Produit> listProduits();
	public Page<Produit> produitsParMotCle(String mc, int page, int size);
	public Page<Produit> produitsParCategorie(Long idCat, int page, int size);
	public List<Produit> produitsSelectionnes();
	public Produit getProduit(Long idP);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p);
	
}
