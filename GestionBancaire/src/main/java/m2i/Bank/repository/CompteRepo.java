package m2i.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import m2i.Bank.entity.Compte;

public interface CompteRepo extends JpaRepository<Compte, Integer>{

	@Query("Select c from Compte c where c.numCompte = :id")
	public Compte findById(@Param("id")int id);

}
