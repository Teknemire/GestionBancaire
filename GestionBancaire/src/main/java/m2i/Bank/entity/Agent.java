package m2i.Bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
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
	
}
