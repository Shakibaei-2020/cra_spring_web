
/**
 * Info Table Collaborateur
 * 
	private int id;
	private String nom;
	private String mail;
	private String mdp;
	private boolean type;
 * 
 */
INSERT INTO Collaborateur VALUES(1,'test@test.fr','test','test',1);
INSERT INTO Collaborateur VALUES(2,'try@try.fr','try','try',0);

/**
 * Info Table NoteDeFrais
 * 
  	private int id;
	private String raison;
	private double prix;
	private Date date;
	private int idColl;
 */

INSERT INTO Note_De_Frais VALUES(1,'2015-12-30',2,55,'raison1');
INSERT INTO Note_De_Frais VALUES(2,'2015-12-30',1,60,'raison2');