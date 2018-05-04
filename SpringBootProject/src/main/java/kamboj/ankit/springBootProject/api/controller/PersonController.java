package kamboj.ankit.springBootProject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kamboj.ankit.springBootProject.api.dto.PersonDto;
import kamboj.ankit.springBootProject.domain.Person;
import kamboj.ankit.springBootProject.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/")
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}
	
	@GetMapping("/{id}")
	public Person getPerson(@PathVariable Long id) {
		return personService.getPerson(id);
	}
	
	@PostMapping
	public Long addPerson(@RequestBody PersonDto personDto) {
		return personService.addPerson(personDto);
	}
	@PutMapping("/{id}")
	public String updatePerson(@RequestBody Person person,@PathVariable Long id) {
		return personService.updatePerson(person,id);
	}
	@DeleteMapping("/{id}")
	public String deletePerson(@PathVariable Long id) {
		return personService.deletePerson(id);
	}
}
