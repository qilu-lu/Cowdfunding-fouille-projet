package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long idDestinataire;
	@Temporal(TemporalType.DATE)
	private Date date;
	private boolean lectureStaff;
	private boolean lectureUtilisateur;
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Message_Personne"),name = "idPersonne")
	private EspaceUtilisateur personne;
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Message_Discussion"),name = "idDiscussion")
	private Discussion discussion;
}
