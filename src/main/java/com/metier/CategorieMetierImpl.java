package com.metier;

import java.util.List;



import com.dao.ICategorieRepository;
import com.entities.Categorie;

public class CategorieMetierImpl implements CategorieMetier{

private ICategorieRepository catrepository;	
	@Override
	public Categorie ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return catrepository.save(c);
	}

	@Override
	public List<Categorie> listCategories() {
		// TODO Auto-generated method stub
		return catrepository.findAll();
	}

	@Override
	public Categorie getCategorie(Long idcat) {
		Categorie ct = catrepository.findOne(idcat);
		if(ct==null) throw new RuntimeException("Categorie Innexistante !");
		return catrepository.findOne(idcat);
	}

	@Override
	public void supprimerCategorie(Long idcat) {
		Categorie c = getCategorie(idcat);
		catrepository.delete(c);
	}

	@Override
	public void modifierCategorie(Categorie c) {
	}

}
