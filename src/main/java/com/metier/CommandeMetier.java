package com.metier;

import com.entities.Client;
import com.entities.Commande;
import com.entities.Panier;

public interface CommandeMetier {
	public Commande enregistrerCommande(Panier p,Client c);

}
