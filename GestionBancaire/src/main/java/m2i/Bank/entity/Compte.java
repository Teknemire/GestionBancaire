package m2i.Bank.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Compte {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numCompte;
	private String typeCompte;
	private float plafondCompte;
	private float decouvertAutorise;
	private float retraitMax;
	private float solde;
	private Date dateOuverture;
	
	public Compte(int numCompte, String typeCompte, float plafondCompte, float decouvertAutorise, float retraitMax,
			float solde, Date dateOuverture) {
		super();
		this.numCompte = numCompte;
		this.typeCompte = typeCompte;
		this.plafondCompte = plafondCompte;
		this.decouvertAutorise = decouvertAutorise;
		this.retraitMax = retraitMax;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	public float getPlafondCompte() {
		return plafondCompte;
	}
	public void setPlafondCompte(float plafondCompte) {
		this.plafondCompte = plafondCompte;
	}
	public float getDecouvertAutorise() {
		return decouvertAutorise;
	}
	public void setDecouvertAutorise(float decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
	public float getRetraitMax() {
		return retraitMax;
	}
	public void setRetraitMax(float retraitMax) {
		this.retraitMax = retraitMax;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public Date getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	//relations
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUtilisateur")
	private Client client;
	
}
