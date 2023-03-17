package m2i.Bank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import m2i.Bank.entity.Agence;
import m2i.Bank.entity.Agent;
import m2i.Bank.entity.Compte;
import m2i.Bank.entity.Utilisateur;
import m2i.Bank.repository.AgenceRepo;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AgenceController {

	
	@Autowired
	private AgenceRepo agtRepo;
	
	@GetMapping("/agence")
	public List<Agence> allClient(){
		return agtRepo.findAll();
	}
	@PostMapping("/agence/agents")
	public List<Utilisateur> allAgenceAgent(@RequestBody Agence a){
		return agtRepo.getAllAgentByAgence(a);
	}
	
	@PostMapping("/agence/comptes")
	public List<Compte> allAgenceComptes(@RequestBody Agence a){
		return agtRepo.getAllCompteByAgence(a);
	}
	
	
	
	@GetMapping("/agence/{id}")
	public Agence getAgence(@PathVariable int id){
		return agtRepo.findById(id).orElseThrow();
	}
	
	@PostMapping("/agence")
	public Agence addAgence(@RequestBody Agence c){
		return agtRepo.save(c);
	}
	
	@DeleteMapping("/agence/{id}")
	public void delete(@PathVariable int id) {
		agtRepo.deleteById(id);
	}
	@PutMapping("/agence")
	public Agence update(@RequestBody Agence c) {
		  return agtRepo.save(c);
	}

}
