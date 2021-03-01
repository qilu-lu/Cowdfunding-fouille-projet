package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Statistiques {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int nbVisiteurs;
	private int nbContributions;
	private int nbProjetsLances;
	private int nbCampagnesReussies;
	@Temporal(TemporalType.DATE)
	private Date date;

}
