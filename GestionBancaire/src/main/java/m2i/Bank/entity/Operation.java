package m2i.Bank.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Operation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOperation;
	private float montantOperation;
	private Date dateOperation;
	private String typeOperation;
	private String roleUtilisateur;
	
	public int getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}
	public float getMontantOperation() {
		return montantOperation;
	}
	public void setMontantOperation(float montantOperation) {
		this.montantOperation = montantOperation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public String getTypeOperation() {
		return typeOperation;
	}
	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}
	public String getRoleUtilisateur() {
		return roleUtilisateur;
	}
	public void setRoleUtilisateur(String roleUtilisateur) {
		this.roleUtilisateur = roleUtilisateur;
	}
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "numCompte")
	private Compte compte;

	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	

}
