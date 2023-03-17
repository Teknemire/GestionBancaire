package m2i.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import m2i.Bank.entity.Agent;

public interface AgentRepo extends JpaRepository<Agent, Integer>{

}