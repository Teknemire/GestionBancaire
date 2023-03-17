package m2i.Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import m2i.Bank.entity.Agent;
import m2i.Bank.entity.Client;
import m2i.Bank.repository.AgentRepo;
import m2i.Bank.repository.ClientRepo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionBancaireApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GestionBancaireApplication.class, args);
		ApplicationContext context = SpringApplication.run(GestionBancaireApplication.class, args);
		ClientRepo clientRep = context.getBean(ClientRepo.class);
		AgentRepo agentRep = context.getBean(AgentRepo.class);
		
		Client c = new Client();
		c.setNom("TEKIN");c.setPrenom("Emre");c.setAdresse("16 rue de Kingersheim");
		c.setEmail("Emre.Tekin@uha.Fr");c.setLogin("george");c.setMotDePasse("jungle");
		c.setProfession("chomeur");c.setRevenuMensuel(500);c.setTelephone("0618487825");
		c.setTypeCompte("Compte courant");c.setEtatCivil("Mr");
		
		clientRep.save(c);
		
		for(Client c1: clientRep.findAll()) {
			System.out.println(c1.toString());
		}
		
		Agent agent = new Agent();
		agent.setEtatCivil("Mme");agent.setEmail("georgette.delajungle@jungle.com");
		agent.setLogin("Gerogette"); agent.setMotDePasse("0000");
		agent.setNom("DelaJungle");agent.setPrenom("Georgette");
		agent.setTelephone("054879512");agent.setTypeAgent("Employé");
		
		agentRep.save(agent);
		
		for(Agent c1: agentRep.findAll()) {
			System.out.println(c1.toString());
		}
	}

}
