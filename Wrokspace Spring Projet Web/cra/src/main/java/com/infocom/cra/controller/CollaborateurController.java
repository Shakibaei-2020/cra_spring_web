package com.infocom.cra.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infocom.cra.dao.CollaborateurDAO;
import com.infocom.cra.model.Collaborateur;
import com.infocom.cra.model.CollaborateurAction;

import io.swagger.annotations.Api;


/**
 * Controller permettant la navigation et le traitement du site
 * 
 * @author mrshakibaei
 *
 */
@Api
@Controller
@RequestMapping(value="/home", method=RequestMethod.POST)
public class CollaborateurController {
	
	
	/**
	 * 
	 */
	@Autowired
	private CollaborateurDAO collaborateurDAO;
	
	/**
	 * 
	 */
	@Autowired
	private CollaborateurAction collaborateurAction;
	
		/**
		 * 
		 * @param model
		 * @return
		 */
	   @RequestMapping(value="/",  method=RequestMethod.GET)
	    public String home(Map<String, Object> model) {
			String coll = collaborateurDAO.findById(1).getNom();
	        model.put("message", coll); 	        
	        return "Connexion";
	    }
	   
	   /**
	    * Controller afin d'effectuer la connexion et rediriger l'utilisateur
	    * 
	    * @param fieldName
	    * @param fieldAge
	    * @return page
	    */
	   @RequestMapping(value="/Accueil",  method=RequestMethod.POST)
	    public String connexionColl(@RequestParam String fieldMail,String fieldMdp) {
		   String page = collaborateurAction.verifCo(fieldMail, fieldMdp);
		   return page;
	    }
	   	  

	   
	   /**
	    * Navigation vers GestionCollab
	    * @return AdminGestionFrais
	    */
	   @RequestMapping(value="/GestionCollab", method=RequestMethod.GET)
	    public String goGestionCollabAdmin(Map<String, Object> model) {
		   
		List tabColl =  collaborateurAction.findAllCollab();
		model.put("tabColl", tabColl);
			  
		return "AdminGestionCollab";
	    }
	   
	   /**
	    * 
	    * @param model
	    * @param fieldId
	    * @param fieldMail
	    * @param fieldMdp
	    * @param fieldNom
	    * @param fieldType
	    * @return
	    */
	   @RequestMapping(value="/UpdateCo", method=RequestMethod.POST)
	   public String updateColl(Map<String, Object> model,@RequestParam int fieldId, String fieldMail,String fieldMdp,String fieldNom,boolean fieldType) {
		   
		   Collaborateur nouvCollaborateur = new Collaborateur(fieldId,fieldMail,fieldMdp,fieldNom,fieldType);
		   String page = collaborateurAction.saveCollab(nouvCollaborateur);
		  
		   List tabColl =  collaborateurAction.findAllCollab();
			model.put("tabColl", tabColl);
			
		   return page;
	   }
	   
	   
	
	  
	   /**
	    * 
	    * @param model
	    * @param fieldId
	    * @return
	    */
	   
	   @RequestMapping(value="/DeleteCo",  method=RequestMethod.POST)
	   public String deleteColl(Map<String, Object> model,@RequestParam int fieldId) {
		   
		collaborateurAction.deleteColl(fieldId);
		   
		List tabColl =  collaborateurAction.findAllCollab();
		model.put("tabColl", tabColl);
		   
		return "AdminGestionCollab";
		   
	   }
	   
	   
	

}
