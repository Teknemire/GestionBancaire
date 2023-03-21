package m2i.Bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import m2i.Bank.entity.Agence;
import m2i.Bank.entity.Compte;
import m2i.Bank.entity.Operation;
import m2i.Bank.entity.Utilisateur;

public interface OperationRepo extends JpaRepository<Operation, Integer>{

	
	
	@Query("Select a from Operation a where a.compte = :c")
	public List<Operation> getOperationBynumCpt(@Param("c") Compte c);
}
