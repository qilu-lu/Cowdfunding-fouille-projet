package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class ContenuCollecte {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomProjet;
	@Lob
	private String descCourte;
	@Lob
	private String descLongue;
	
	
	@OneToOne
	@JoinColumn(name = "idCollecte")
	private Collecte collecte;
}
