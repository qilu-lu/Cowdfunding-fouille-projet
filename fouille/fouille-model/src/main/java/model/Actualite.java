package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Actualite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	//@Type(type = "text")
	@Lob
	private String description;
	
	@Enumerated(EnumType.STRING)
	private TypeContenu contenu;
	
	private Long refIdContenu;
	
	
}
