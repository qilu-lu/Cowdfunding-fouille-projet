package model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMission;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private BigDecimal duree;
	
	@OneToOne
	@JoinColumn(name = "idCycle")
	private Cycle cycle;
	

}
