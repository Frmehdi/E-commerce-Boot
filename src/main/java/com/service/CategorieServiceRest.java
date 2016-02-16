package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Categorie;
import com.metier.CategorieMetier;

@RestController
public class CategorieServiceRest {
	@Autowired
private CategorieMetier categorieMetier;
	@RequestMapping(value="/Categorie/categories",method=RequestMethod.POST)
	public Categorie ajouterCategorie(@RequestBody Categorie c) {
		return categorieMetier.ajouterCategorie(c);
	}
	@RequestMapping(value="/Categorie/categories",method=RequestMethod.GET)
	public List<Categorie> listCategories() {
		return categorieMetier.listCategories();
	}
	@RequestMapping(value="/Categorie/categories/{idcat}",method=RequestMethod.GET)
	public Categorie getCategorie(@PathVariable Long idcat) {
		return categorieMetier.getCategorie(idcat);
	}

	@RequestMapping(value="/Categorie/categories",method=RequestMethod.DELETE)
	public void supprimerCategorie(@RequestParam Long idcat) {
		categorieMetier.supprimerCategorie(idcat);
	}

	@RequestMapping(value="/Categorie/categories",method=RequestMethod.PUT)
	public void modifierCategorie(@RequestParam Categorie c) {
		categorieMetier.modifierCategorie(c);
	}
}
