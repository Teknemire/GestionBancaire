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

import m2i.Bank.entity.Client;
import m2i.Bank.repository.ClientRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
	
	
	@Autowired
	private ClientRepo cliRepo;
	
	@GetMapping("/clients")
	public List<Client> allClient(){
		return cliRepo.findAll();
	}
	
	@GetMapping("/clients/{id}")
	public Client getClient(@PathVariable int id){
		return cliRepo.findById(id).orElseThrow();
	}
	
	@PostMapping("/clients")
	public Client addClient(@RequestBody Client c){
		return cliRepo.save(c);
	}
	
	@DeleteMapping("/clients/{id}")
	public void delete(@PathVariable int id) {
		 cliRepo.deleteById(id);
	}
	@PutMapping("/clients")
	public Client update(@RequestBody Client c) {
		  return cliRepo.save(c);
	}

}
