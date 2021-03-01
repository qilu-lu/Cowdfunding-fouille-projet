package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Projet {
	public Projet() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDepot;
	
	@Enumerated(EnumType.STRING)
	@ColumnDefault("'EN_ATTENTE_DE_TRAITEMENT'")
	private EtatProjet etat;
	
	private String titre;
	private String rattachement;
	
	@Lob
	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date dateEnvisagee;
	

	private String pays;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "FK_PROJET_PERSONNEPorteur"),name = "idPorteurDeProjet")
	private Personne personne;
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_PROJET_PERSONNEGestionnaire"),name = "idGestionnaire")
	private Personne gestionnaire;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EtatProjet getEtat() {
		return etat;
	}

	public void setEtat(EtatProjet etat) {
		this.etat = etat;
	}
}
