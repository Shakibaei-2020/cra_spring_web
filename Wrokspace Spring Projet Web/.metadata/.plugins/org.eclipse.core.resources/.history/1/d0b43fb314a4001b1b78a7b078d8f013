package com.infocom.cra.dao;

import org.springframework.stereotype.Repository;

import com.infocom.cra.model.NoteDeFrais;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * 
 * @author mrshakibaei
 *
 */
@Repository
public interface NoteDeFraisDAO extends JpaRepository<NoteDeFrais,Integer> {

	
	/**
	 * 
	 * @param id
	 * @return NoteDeFrais
	 */
	NoteDeFrais  findById(int id);
	
	/**
	 * 
	 * @param id
	 * @return NoteDeFrais
	 */
	NoteDeFrais deleteById(int id);
	

	@Query(value="SELECT nf.id, nf.date, nf.id_coll, nf.prix, nf.raison FROM note_de_frais nf INNER JOIN collaborateur cl ON nf.ID_COLL = cl.id WHERE cl.id = :fieldIdColl",nativeQuery = true)
	List<NoteDeFrais> laNote(@Param("fieldIdColl") int fieldIdColl);
	
}
