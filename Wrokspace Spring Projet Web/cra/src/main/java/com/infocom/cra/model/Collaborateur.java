package com.infocom.cra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author mrshakibaei
 *
 */
@Entity
public class Collaborateur {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nom;
	private String mail;
	private String mdp;
	private boolean type; //Collaborateur interne ou externe ? 
	
	
	/**
	 * Constructeur vide
	 */
	public Collaborateur() {}

	/**
	 * Constructeur avec champs
	 * @param id
	 * @param nom
	 * @param mail
	 * @param mdp
	 * @param type
	 */
	public Collaborateur(int id, String mail, String mdp, String nom, boolean type) {
		super();
		this.id = id;
		this.mail = mail;
		this.mdp = mdp;
		this.nom = nom;
		this.type = type;
	}
	
	/**
	 * Getters et Setters de Collaborateur
	 */

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public boolean getType() {
		return type;
	}


	public void setAdmin() {
		this.type = true;
	}
	
	public void setInterne() {
		this.type = false;
	}

	/**
	 *  To String de Collaborateur
	 */
	@Override
	public String toString() {
		return "Collaborateur [id=" + id + ", nom=" + nom + ", mail=" + mail + ", mdp=" + mdp + ", type=" + type + "]";
	}

	
}
