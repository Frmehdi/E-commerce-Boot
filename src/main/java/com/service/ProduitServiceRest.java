package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Produit;
import com.metier.ProduitMetier;

@RestController
public class ProduitServiceRest {
	@Autowired
	private ProduitMetier produitMetier;
	@RequestMapping(value="/Produit/produits",method=RequestMethod.POST)
	public Produit ajouterProduit(@RequestBody Produit p) {
		return produitMetier.ajouterProduit(p);
	}
	@RequestMapping(value="/Produit/produits",method=RequestMethod.GET)
	public List<Produit> listProduits() {
		return produitMetier.listProduits();
	}
	@RequestMapping(value="/Produit/produitsMc",method=RequestMethod.GET)
	public Page<Produit> produitsParMotCle(@RequestParam String mc, @RequestParam int page,@RequestParam int size) {
		return produitMetier.produitsParMotCle(mc, page, size);
	}
	@RequestMapping(value="/Produit/produitsCat",method=RequestMethod.GET)
	public Page<Produit> produitsParCategorie(@RequestParam Long idCat,@RequestParam int page,@RequestParam int size) {
		return produitMetier.produitsParCategorie(idCat, page, size);
	}

	@RequestMapping(value="/Produit/produits",method=RequestMethod.GET)
	public List<Produit> produitsSelectionnes() {
		return produitMetier.produitsSelectionnes();
	}

	@RequestMapping(value="/Produit/produits/{idP}",method=RequestMethod.GET)
	public Produit getProduit(@PathVariable Long idP) {
		return produitMetier.getProduit(idP);
	}

	@RequestMapping(value="/Produit/produits",method=RequestMethod.DELETE)
	public void supprimerProduit(@RequestParam Long idP) {
		produitMetier.supprimerProduit(idP);
	}

	@RequestMapping(value="/Produit/produits",method=RequestMethod.PUT)
	public void modifierProduit(@RequestParam  Produit p) {
		produitMetier.modifierProduit(p);
	}

}
