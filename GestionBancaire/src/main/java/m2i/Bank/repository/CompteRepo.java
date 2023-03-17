package m2i.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import m2i.Bank.entity.Compte;

public interface CompteRepo extends JpaRepository<Compte, Integer>{

}
