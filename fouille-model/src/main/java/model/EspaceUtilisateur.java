package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class EspaceUtilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column( nullable = false)
	private String email;
	@Column( nullable = false)
	private Long motDePasse;
	private byte[] avatar ;
	
	@OneToOne
	@JoinColumn(name = "idPersonne")
	private Personne personne;

	@OneToOne
	@JoinColumn(name = "idAdresse")
	private Adresse adresse;
	
//	@OneToMany(cascade = { CascadeType.ALL })
//	@JoinColumn(name = "discussion_id", referencedColumnName = "id")
//	private Set<Discussion> discussion;
//	
	
	@OneToMany
	@JoinColumn(name="idEspaceUtilisateur")
	public List<Favoris> listeDeFavoris;

}
