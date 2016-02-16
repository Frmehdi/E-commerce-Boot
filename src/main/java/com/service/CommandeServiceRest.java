package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Client;
import com.entities.Commande;
import com.entities.Panier;
import com.metier.CommandeMetier;

@RestController
public class CommandeServiceRest {
	@Autowired
	private CommandeMetier commandeMetier;
	@RequestMapping(value="/Commande/commande",method=RequestMethod.POST)
	public Commande enregistrerCommande(@RequestBody Panier p,@RequestBody Client c) {
		return commandeMetier.enregistrerCommande(p, c);
	}
	

}
