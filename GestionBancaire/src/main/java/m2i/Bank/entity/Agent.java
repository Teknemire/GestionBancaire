package m2i.Bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AGENT")
@DiscriminatorValue("agent")
public class Agent extends Utilisateur {
    
	@Column(name = "typeAgent")
	private String typeAgent;
    // getters and setters

	public String getTypeAgent() {
		return typeAgent;
	}

	public void setTypeAgent(String typeAgent) {
		this.typeAgent = typeAgent;
	}

	@Override
	public String toString() {
		return super.toString()+"Agent [typeAgent=" + typeAgent + "]";
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAgence")
    private Agence agence;

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}
}
