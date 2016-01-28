package com.metier;

import java.util.Date;

import com.dao.IClientRepository;
import com.dao.ICommandeRepository;
import com.dao.ILigneCommandeRepository;
import com.entities.Client;
import com.entities.Commande;
import com.entities.LigneCommande;
import com.entities.Panier;

public class CommandeMetierImpl implements CommandeMetier{

	private ICommandeRepository commanderepository;
	private IClientRepository clientrepository;
	private ILigneCommandeRepository ligneCommanderepository;
	
	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		clientrepository.save(c);
		Commande cmd  = new Commande();
		cmd.setDateCommande(new Date());
		cmd.setItems(p.getItems());
		for(LigneCommande lc : p.getItems()){
			ligneCommanderepository.save(lc);
		}
		commanderepository.save(cmd);
		return cmd;
	}

}
