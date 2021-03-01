package model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Favoris {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Favori_EspaceUtilisateur"),name = "idEspaceUtilisateur")
	private EspaceUtilisateur espaceUtilisateur;
	
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Favoris_Projet"),name = "idProjet")
	private Projet projet;
	
	

}
