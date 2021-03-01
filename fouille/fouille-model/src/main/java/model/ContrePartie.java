package model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class ContrePartie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private BigDecimal montant;
	private String titre;
	
	@Lob
	private String description;
	
	@Lob
	private byte[] image ;
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_collecte_contrePartie"),name = "idCollecte")
	private Collecte collecte;
	
	
}
