package m2i.Bank.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Agence {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAgence;
	private String nomAgence;
	private String adresseAgence;
	private String emailAgence;
	private String telAgence;
	
	public int getIdAgence() {
		return idAgence;
	}
	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}
	public String getNomAgence() {
		return nomAgence;
	}
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}
	public String getAdresseAgence() {
		return adresseAgence;
	}
	public void setAdresseAgence(String adresseAgence) {
		this.adresseAgence = adresseAgence;
	}
	public String getEmailAgence() {
		return emailAgence;
	}
	public void setEmailAgence(String emailAgence) {
		this.emailAgence = emailAgence;
	}
	public String getTelAgence() {
		return telAgence;
	}
	public void setTelAgence(String telAgence) {
		this.telAgence = telAgence;
	}
	
	@OneToMany(mappedBy = "agence")
    private List<Agent> agents;
	
	@OneToMany(mappedBy = "compte")
    private List<Compte> comptes;

	public List<Agent> getAgents() {
		return agents;
	}
	public void setAgents(List<Agent> agents) {
		this.agents = agents;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	
}
