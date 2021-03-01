package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cycle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Saison saison;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Enumerated(EnumType.STRING)  
	private Thematique thematique;
	
	@Enumerated(EnumType.STRING)  
	private Chronologie chronologie;
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Cycle_Projet"),name = "idProjet")
	private Projet projet ;

}
