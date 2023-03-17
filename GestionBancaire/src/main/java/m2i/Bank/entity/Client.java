package m2i.Bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENT")
@DiscriminatorValue("client")
public class Client extends Utilisateur {
    @Column(name = "adresse")
    private String adresse;

    @Column(name = "profession")
    private String profession;

    @Column(name = "revenuMensuel")
    private double revenuMensuel;

    @Column(name = "typeCompte")
    private String typeCompte;

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public double getRevenuMensuel() {
		return revenuMensuel;
	}

	public void setRevenuMensuel(double revenuMensuel) {
		this.revenuMensuel = revenuMensuel;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	@Override
	public String toString() {
		return super.toString() + "Client [adresse=" + adresse + ", profession=" + profession + ", revenuMensuel=" + revenuMensuel
				+ ", typeCompte=" + typeCompte + "]";
	}

    // relations
//    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
//    private Compte compte;


}
