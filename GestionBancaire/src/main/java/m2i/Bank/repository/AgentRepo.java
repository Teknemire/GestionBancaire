package m2i.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import m2i.Bank.entity.Agent;
import m2i.Bank.entity.Utilisateur;

public interface AgentRepo extends JpaRepository<Agent, Integer>{

	@Query("select a from Utilisateur a where a.login=:login and a.motDePasse=:password and a.typeUtilisateur='agent'")
	public Utilisateur findbyLoginAndPwd(@Param("login") String login,@Param("password") String pwd); 
}