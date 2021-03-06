package com.infocom.cra.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infocom.cra.dao.NoteDeFraisDAO;
import com.infocom.cra.model.Collaborateur;
import com.infocom.cra.model.NoteDeFrais;
import com.infocom.cra.model.NoteDeFraisAction;

import io.swagger.annotations.Api;

/**
 * 
 * @author mrshakibaei
 *
 */
@Api
@Controller
@RequestMapping(value="/home2",method=RequestMethod.POST)
public class NoteDeFraisController {
	
	/**
	 * 
	 */
	@Autowired
	private NoteDeFraisDAO noteDeFraisDAO;
	
	/**
	 * 
	 */
	@Autowired
	private NoteDeFraisAction NoteDeFraisAction;
	
	
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	
	  @RequestMapping(value="/GestionFrais",method=RequestMethod.POST)
	    public String goGestionFrais(Map<String, Object> model) {
		   
		List tabFrais =  NoteDeFraisAction.findAllFrais();
		model.put("tabFrais", tabFrais);
			  
			  
		return "AdminGestionFrais";
	    }
	   
	   
	  /**
	  <input name="fieldId" type="text" value="id" />
	  <input name="fieldRaison" type="text" value="raison" />
	  <input name="fieldPrix" type="text" value="idPrix" />
	  <input name="fieldDate" type="date" value="idDate" />
	  <input name="fieldIdColl" type="text" value="idColl" />
	  */
	  
	  /**
	   * 
	   * @param model
	   * @param fieldId
	   * @param fieldRaison
	   * @param fieldPrix
	   * @param fieldDate
	   * @param fieldIdColl
	   * @return
	   */
	  
	   @RequestMapping(value="/UpdateFrais",method=RequestMethod.GET)
	   public String updateFrais(Map<String, Object> model,@RequestParam int fieldId, String fieldRaison,double fieldPrix,String fieldDate,int fieldIdColl) {
		   
		try {
			Date fieldDateUp = new SimpleDateFormat("yyyy-MM-dd").parse(fieldDate);
			
			NoteDeFrais nouvFrais = new NoteDeFrais(fieldId, fieldRaison, fieldPrix, fieldDateUp, fieldIdColl);
			   String page = NoteDeFraisAction.saveCollab(nouvFrais);
			  
			   List tabFrais =  NoteDeFraisAction.findAllFrais();
			   model.put("tabFrais", tabFrais);
				
			   return page;
			   
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		    
		   return "AdminGestionFrais";
	   }
	   
	   /**
	    * 
	    * @param model
	    * @param fieldId
	    * @param fieldRaison
	    * @param fieldPrix
	    * @param fieldDate
	    * @param fieldIdColl
	    * @return
	    */
	   @RequestMapping(value="/AjoutFrais",method=RequestMethod.GET)
	   public String ajoutFrais(Map<String, Object> model,@RequestParam int fieldId, String fieldRaison,double fieldPrix,String fieldDate,int fieldIdColl) {
		   
		try {
			Date fieldDateUp = new SimpleDateFormat("yyyy-MM-dd").parse(fieldDate);
			
			NoteDeFrais nouvFrais = new NoteDeFrais(fieldId, fieldRaison, fieldPrix, fieldDateUp, fieldIdColl);
			   String page = NoteDeFraisAction.saveCollab(nouvFrais);
			  
			   List tabFrais =  NoteDeFraisAction.findAllFrais();
			   model.put("tabFrais", tabFrais);
				
			   return "AccueilInterne";
			   
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		    
		   return "AccueilInterne";
	   }
	   
	   
	   /**
	    * 
	    * @param model
	    * @param fieldId
	    * @return
	    */
	   @RequestMapping(value="/DeleteFrais" ,method=RequestMethod.POST)
	   public String deleteColl(Map<String, Object> model,@RequestParam int fieldId) {
		   
	    NoteDeFraisAction.deleteFrais(fieldId);
		   
		List tabFrais =  NoteDeFraisAction.findAllFrais();
		model.put("tabFrais", tabFrais);
		   
		return "AdminGestionFrais";
		   
	   }
	   
	   
	   @RequestMapping(value="/CheckFrais",  method=RequestMethod.POST)
	   public String test(Map<String, Object> model,@RequestParam int fieldIdColl) {
		 List tabFraisColl = NoteDeFraisAction.getNoteDeFraisDuColl(fieldIdColl); 
		 System.out.println(tabFraisColl);
		 model.put("tabFraisColl", tabFraisColl);
		 
		  return "AdminGestionFrais";
	   }

}
