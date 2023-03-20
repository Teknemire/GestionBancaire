package m2i.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import m2i.Bank.entity.Client;
import m2i.Bank.entity.Utilisateur;

public interface ClientRepo extends JpaRepository<Client, Integer>{

	@Query("select a from Utilisateur a where a.login=:login and a.motDePasse=:password and a.typeUtilisateur='client'")
	public Utilisateur findbyLoginAndPwd(@Param("login") String login,@Param("password") String pwd); 
}
