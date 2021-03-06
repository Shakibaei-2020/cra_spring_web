package com.infocom.cra.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infocom.cra.dao.CollaborateurDAO;
import com.infocom.cra.model.*;



/**
 * Ici les actions executées par le controlleur
 * @author mrshakibaei
 *
 */
@Repository
public class CollaborateurAction {
	
	
	/**
	 * 
	 */
	@Autowired
	private CollaborateurDAO collaborateurDAO;
	
	/**
	 * Fonction permettant d'effecuter la connexion de l'utilisateur.
	 * 
	 * @param fieldMail type String
	 * @param fieldMdp type String
	 * 
	 * @return "AccueilInterne" type String
	 * or
	 * @return "AccueilAdmin" type String
	 * or
	 * @retun "home" type String
	 * 
	 * Fonctions externe utilisées:
	 * findByMail(String) from CollaborateurDAO.
	 */
	public String verifCo(String fieldMail, String fieldMdp) {
		   
		   Collaborateur coll = collaborateurDAO.findByMail(fieldMail);
		   String mailColl = coll.getMail();
		   String mdpColl = coll.getMdp();
		   boolean typeColl = coll.getType();
		   		   
		   if(fieldMail.equals(mailColl) && fieldMdp.equals(mdpColl) && typeColl == false) {
			   
		        return "AccueilInterne";
		        
		   }else if(fieldMail.equals(mailColl) && fieldMdp.equals(mdpColl) && typeColl == true) {
		        return "AccueilAdmin";			   
		   }
		return "home";
	}
	
	/**
	 * 
	 * @param collaborateur
	 * @return page
	 */
	public String saveCollab(Collaborateur collaborateur) {
		collaborateur = collaborateurDAO.save(collaborateur);
		return "AdminGestionCollab";
	}
	
	
	/**
	 * 
	 * @return collaborateur
	 */
	public List findAllCollab() {
				 List<Collaborateur> coll = new ArrayList<Collaborateur>();
				 coll = collaborateurDAO.findAll();
				 
		return coll;
	}
	
	/**
	 * 
	 * @param fieldId
	 */
	public void deleteColl(int fieldId) {
		collaborateurDAO.deleteById(fieldId); 
	}

	

}
