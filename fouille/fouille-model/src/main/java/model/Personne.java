package model;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private Integer numeroTel;
	
	@Enumerated(EnumType.STRING)  
	private TypeRole role;
	
//	@OneToMany @JoinColumn(name="idGestionnaire")  
//	public List<Projet> listeDeProjets;


}
