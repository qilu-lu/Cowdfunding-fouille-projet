package model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DossierAdministratif {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "dossier_administratif_id", referencedColumnName = "id")
	private Set<Document> documents;
	
	@OneToOne
	@JoinColumn(name = "projet_id")
	private Projet projet;
}
