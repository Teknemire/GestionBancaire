package m2i.Bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import m2i.Bank.entity.Agence;
import m2i.Bank.entity.Agent;
import m2i.Bank.entity.Compte;
import m2i.Bank.entity.Utilisateur;

public interface AgenceRepo extends JpaRepository<Agence, Integer>{

	@Query("Select a, b from Utilisateur a join a.agence b where b = :agence and a.typeUtilisateur ='agent'")
	public List<Utilisateur> getAllAgentByAgence(@Param("agence") Agence a);
	
	@Query("Select a, b from Compte a join a.agence b where b = :agence")
	public List<Compte> getAllCompteByAgence(@Param("agence") Agence a);
	
	@Query("Select a, b from Utilisateur a join a.agence b where b = :agence and a.typeUtilisateur ='client'")
	public List<Utilisateur> getAllClientByAgence(@Param("agence") Agence a);

}
