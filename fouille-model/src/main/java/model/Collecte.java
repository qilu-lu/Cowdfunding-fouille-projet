package model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Collecte {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateCloture;
	private Integer duree;
	private BigDecimal montantDemande;
	private BigDecimal montantCollecte;

	@OneToOne
	@JoinColumn(name = "idCycle")
	private Cycle cycle;
	
	
	@OneToMany  
	@JoinColumn(name="idCollecte")
	public List<Don> listeDeDons = new LinkedList<>();

	@OneToMany
	@JoinColumn(name="idCollecte")
	public List<ContrePartie> listeDeContreParties = new LinkedList<>();

	
	public Collecte() {
		
	}

	public long getId() {
		return id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateCloture() {
		return dateCloture;
	}

	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public BigDecimal getMontantDemande() {
		return montantDemande;
	}

	public void setMontantDemande(BigDecimal montantDemande) {
		this.montantDemande = montantDemande;
	}

	public BigDecimal getMontantCollecte() {
		return montantCollecte;
	}

	public void setMontantCollecte(BigDecimal montantCollecte) {
		this.montantCollecte = montantCollecte;
	}

}
