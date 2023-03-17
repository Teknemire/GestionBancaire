package m2i.Bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
	
	
	
}
