package model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Don {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDon;
	private BigDecimal montant;
	private boolean anonyme;

	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Don_Collecte"),name = "idCollecte")
	private Collecte collecte;
	
	@OneToOne
	@JoinColumn(name = "idPersonne")
	private Personne personne;
	
}
