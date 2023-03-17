package m2i.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import m2i.Bank.entity.Client;

public interface ClientRepo extends JpaRepository<Client, Integer>{

}
