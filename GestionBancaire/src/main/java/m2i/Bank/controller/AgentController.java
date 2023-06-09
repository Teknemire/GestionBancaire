package m2i.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import m2i.Bank.entity.Agent;
import m2i.Bank.repository.AgentRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AgentController {
	
	@Autowired
	private AgentRepo agtRepo;
	
	@GetMapping("/agents")
	public List<Agent> allAgent(){
		return agtRepo.findAll();
	}
	
	@GetMapping("/agents/{id}")
	public Agent allAgent(@PathVariable int id) {
		return agtRepo.findById(id).orElseThrow();
	}
	
	@PostMapping("/agents")
	public Agent allAgent(@RequestBody Agent a) {
		return agtRepo.save(a);
	}

}
