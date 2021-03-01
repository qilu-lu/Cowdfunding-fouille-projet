package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column( nullable = false, length= 100)
	private String textCommentaire;
	private Long refComParent;
	
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Commentaire_EspaceUtilisateur"),name = "idEspaceUtilisateur")
	private EspaceUtilisateur espaceUtilisateur;
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Commentaire_projet"),name = "idProjet")
	private Projet projet;

}
