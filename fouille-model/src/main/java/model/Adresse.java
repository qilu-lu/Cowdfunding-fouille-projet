package model;

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
public class Adresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column( nullable = false)
	private String rue;
	@Column( nullable = false)
	private String codePostal;
	@Column( nullable = false)
	private String ville;
	private Double longitude;
	private Double latitude;
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Adresse_Pays"),name = "idPays")
	private Pays pays;
	
	
}
