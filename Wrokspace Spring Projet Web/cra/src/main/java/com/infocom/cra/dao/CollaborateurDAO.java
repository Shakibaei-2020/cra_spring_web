package com.infocom.cra.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infocom.cra.model.Collaborateur;
import com.infocom.cra.model.NoteDeFrais;

/**
 *Ici les fonctions principales pour l'exploitation de la base de données
 * 
 * @author mrshakibaei
 *
 */
@Repository
public interface CollaborateurDAO extends JpaRepository<Collaborateur,Integer> {
	
	/**
	 * 
	 * @param id
	 * @return collaborateur
	 */
	Collaborateur findById(int id);
	
	
	/**
	 * 
	 * @param fieldMail
	 * @return collaborateur
	 */
	Collaborateur findByMail(String fieldMail);
		
	/**
	 * 
	 * @param id
	 */
	Collaborateur deleteById(int id);
		

}
