package com.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Commande implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCommande;
	private Date dateCommande;
	@OneToMany(mappedBy="commande")
	private Collection<LigneCommande> items;
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the idCommande
	 */
	public Long getIdCommande() {
		return idCommande;
	}
	/**
	 * @param idCommande the idCommande to set
	 */
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	/**
	 * @return the dateCommande
	 */
	public Date getDateCommande() {
		return dateCommande;
	}
	/**
	 * @param dateCommande the dateCommande to set
	 */
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	/**
	 * @return the items
	 */
	public Collection<LigneCommande> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(Collection<LigneCommande> items) {
		this.items = items;
	}
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
