package com.infocom.cra.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @author mrshakibaei
 *
 */
@Entity
public class NoteDeFrais {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	private String raison;
	private double prix;
	private Date date;
	private int idColl;
	
	/**
	 * 
	 * @param id
	 * @param raison
	 * @param prix
	 * @param date
	 * @param idColl
	 */
	public NoteDeFrais(int id, String raison, double prix, Date date, int idColl) {
		super();
		this.id = id;
		this.raison = raison;
		this.prix = prix;
		this.date = date;
		this.idColl = idColl;
	}

	/**
	 * 
	 */
	public NoteDeFrais() {}
	
	/**
	 * Creations des getter et setters
	 */
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getRaison() {
		return raison;
	}
	public void setRaison(String raison) {
		this.raison = raison;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getIdColl() {
		return idColl;
	}
	public void setIdColl(int idColl) {
		this.idColl = idColl;
	}

	@Override
	public String toString() {
		return "NoteDeFrais [id=" + id + ", raison=" + raison + ", prix=" + prix + ", date=" + date + ", idColl="
				+ idColl + "]";
	}
	
	
	
}
