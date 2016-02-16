package com.metier;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.dao.IProduitRepository;
import com.entities.Categorie;
import com.entities.Produit;
import com.*;

public class ProduitMetierImpl implements ProduitMetier{

	
	private IProduitRepository prodrepository;
	private CategorieMetier catm;
	@Override
	public Produit ajouterProduit(Produit p) {
	/*Categorie c = catm.getCategorie(idCat);
	p.setCategorie(c);*/
		return prodrepository.save(p);
	}

	@Override
	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return prodrepository.findAll();
	}

	@Override
	public Page<Produit> produitsParMotCle(String mc, int page, int size) {
		// TODO Auto-generated method stub
		return prodrepository.getProduitmc(mc, new PageRequest(page, size));
	}

	@Override
	public Page<Produit> produitsParCategorie(Long idCat, int page, int size) {
		// TODO Auto-generated method stub
		return prodrepository.getProduitCat(idCat, new PageRequest(page, size));
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		// TODO Auto-generated method stub
		return (List<Produit>) prodrepository.getProduitSelec();
	}

	@Override
	public Produit getProduit(Long idP) {
		Produit p = prodrepository.findOne(idP);
		if(p==null) throw new RuntimeException("Produit Innexistant !");
		return prodrepository.findOne(idP);
	}

	@Override
	public void supprimerProduit(Long idP) {
		// TODO Auto-generated method stub
		Produit p = getProduit(idP);
		prodrepository.delete(p);
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

}
