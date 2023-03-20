package m2i.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import m2i.Bank.entity.Operation;

public interface OperationRepo extends JpaRepository<Operation, Integer>{

}
