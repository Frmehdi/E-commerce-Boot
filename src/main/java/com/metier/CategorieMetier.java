package com.metier;

import java.util.List;

import com.entities.Categorie;

public interface CategorieMetier {
	public Categorie ajouterCategorie(Categorie c);
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idcat);
	public void supprimerCategorie(Long idcat);
	public void modifierCategorie(Categorie c);
	
}
