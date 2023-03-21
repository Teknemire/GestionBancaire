package m2i.Bank.controller;
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

import m2i.Bank.entity.Compte;
import m2i.Bank.repository.CompteRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CompteController {
	
	@Autowired
	private CompteRepo cmpRepo;
	
	@GetMapping("/compte")
	public List<Compte> allCompte(){
		return cmpRepo.findAll();
	}
	
	@GetMapping("/compte/{numCompte}")
	public Compte getCompte(@PathVariable int numCompte) {
		return cmpRepo.findById(numCompte);
	}
	
	@PostMapping("/compte")
	public Compte addCompte(@RequestBody Compte c) {
		return cmpRepo.save(c);
	}
	@PutMapping("/compte")
	public Compte updateCompte(@RequestBody Compte c) {
		return cmpRepo.save(c);
	}
	
	@DeleteMapping("/compte")
	public void deleteCompte(@RequestBody Compte c) {
		 cmpRepo.delete(c);
	}

}
