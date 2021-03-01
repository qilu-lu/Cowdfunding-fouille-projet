package model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Discussion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String sujet;
	
	
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "FK_Discussion_Utilisateur"),name = "idUtilisateur")
	private EspaceUtilisateur utilisateur;
	
	@ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "FK_Discussion_Staff"),name = "idStaff")
	private EspaceUtilisateur staff;
	
	
	
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "idDiscussion") //, referencedColumnName = "id"
	private Set<Message> messages;
	
}
