package m2i.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import m2i.Bank.entity.Compte;
import m2i.Bank.entity.Operation;
import m2i.Bank.repository.CompteRepo;
import m2i.Bank.repository.OperationRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OperationController {

	@Autowired
	private OperationRepo opeRepo;
	
	@Autowired
	CompteRepo cptRepo;
	
	@GetMapping("/operations")
	public List<Operation> allOperation(){
		return opeRepo.findAll();
	}
	
	@GetMapping("/operations/{id}")
	public Operation getOperation(@PathVariable int id) {
		return opeRepo.findById(id).orElseThrow();
	}
	@PostMapping("/operations/client")
	public List<Operation> getOperationbyNumCpt(@RequestBody Compte c) {
		return opeRepo.getOperationBynumCpt(c);
	}
	
	@PostMapping("/operations")
	public Operation allOperation(@RequestBody Operation o) {
		return opeRepo.save(o);
	}
	
	@PutMapping("/operations")
	public Operation updateOperation(@RequestBody Operation o) {
		return opeRepo.save(o);
	}
	
	@PostMapping("/operations/depot")
	public void operationDepot(@RequestBody Operation o) {
		Compte cpt = new Compte();
		cpt = cptRepo.findById(o.getCompte().getNumCompte());
		cpt.setSolde(cpt.getSolde()+o.getMontantOperation());
		
		cptRepo.save(cpt);
		opeRepo.save(o);
		
	}
	
	@PostMapping("/operations/retrait")
	public void operationRetrait(@RequestBody Operation o) {
		Compte cpt = new Compte();
		cpt = cptRepo.findById(o.getCompte().getNumCompte());
		if(o.getMontantOperation()<cpt.getRetraitMax()) {
			cpt.setSolde(cpt.getSolde()-o.getMontantOperation());
			cptRepo.save(cpt);
			opeRepo.save(o);
		}else {
			o.setTypeOperation("Retrait maximum autorisé dépassé");
			opeRepo.save(o);
		}
		
		
	}
	
}
