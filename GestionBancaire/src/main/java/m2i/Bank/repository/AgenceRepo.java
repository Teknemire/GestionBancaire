package m2i.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import m2i.Bank.entity.Agence;

public interface AgenceRepo extends JpaRepository<Agence, Integer>{

}
