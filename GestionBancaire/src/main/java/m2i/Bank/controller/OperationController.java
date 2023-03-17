package m2i.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import m2i.Bank.entity.Operation;
import m2i.Bank.repository.OperationRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OperationController {

	@Autowired
	private OperationRepo opeRepo;
	
	@GetMapping("/operations")
	public List<Operation> allOperation(){
		return opeRepo.findAll();
	}
	
	@GetMapping("/operations/{id}")
	public Operation allOperation(@PathVariable int id) {
		return opeRepo.findById(id).orElseThrow();
	}
	
	@PostMapping("/operations")
	public Operation allOperation(@RequestBody Operation o) {
		return opeRepo.save(o);
	}
	
}
