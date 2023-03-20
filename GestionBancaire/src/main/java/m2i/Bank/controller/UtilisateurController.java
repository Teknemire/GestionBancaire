package m2i.Bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import m2i.Bank.entity.Utilisateur;
import m2i.Bank.payload.Login;
import m2i.Bank.repository.AgentRepo;
import m2i.Bank.repository.ClientRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UtilisateurController {
	
	@Autowired
	AgentRepo agtRepo;
	
	@Autowired
	ClientRepo cltRepo;
	
	
	
	@PostMapping("/login")
	public Utilisateur loginUser(@RequestBody Login l){
		Utilisateur u;
		if(l.getRole().equals("agent")) {
			u= agtRepo.findbyLoginAndPwd(l.getLogin(),l.getPwd()) ;
			
		}else{
			u= cltRepo.findbyLoginAndPwd(l.getLogin(),l.getPwd()) ;
		}
		if(u!= null) {
			return u;
		}else {
			return null;
		}
		
	}
	

}
