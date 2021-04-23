package com.infocom.cra.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infocom.cra.dao.NoteDeFraisDAO;

/**
 * 
 * @author mrshakibaei
 *
 */
@Repository
public class NoteDeFraisAction {
	
	/**
	 * 
	 */
	@Autowired
	private NoteDeFraisDAO noteDeFraisDAO;
	
	/**
	 * 
	 * @param NoteDeFrais
	 * @return
	 */
	public String saveCollab(NoteDeFrais NoteDeFrais) {
		NoteDeFrais = noteDeFraisDAO.save(NoteDeFrais);
		return "AdminGestionFrais";
	}
	
	/**
	 * 
	 * @return
	 */
	public List findAllFrais() {
				 List<NoteDeFrais> listNoteDeFrais = new ArrayList<NoteDeFrais>();
				 listNoteDeFrais = noteDeFraisDAO.findAll();
		return listNoteDeFrais;
	}
	
	/**
	 * 
	 * @param fieldId
	 */
	public void deleteFrais(int fieldId) {
		noteDeFraisDAO.deleteById(fieldId); 
	}

	
	public List getNoteDeFraisDuColl(int fieldIdColl) {
		 List<NoteDeFrais> notedefrais = new ArrayList<NoteDeFrais>();

		 notedefrais = noteDeFraisDAO.laNote(fieldIdColl);
		 return notedefrais;
	}
}
