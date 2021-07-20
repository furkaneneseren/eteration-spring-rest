package restexample.eteration.controllers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restexample.eteration.dto.PersonDTO;
import restexample.eteration.model.Person;

@RestController
public class Controller {
	
	List<Person> personList = new ArrayList<>();
	
	@GetMapping("/")
	public ResponseEntity<String> home() {
        return new ResponseEntity<>("API Working!", HttpStatus.OK);
    }
	
	@GetMapping("/persons")
	public ResponseEntity<List<Person>> getPersons(){
		return new ResponseEntity<> (personList, HttpStatus.OK);
	}
	
 	@PostMapping("/person/new")
	public ResponseEntity<String> addPerson(@RequestBody Person person) {
 		//PersonDTO convertedPerson = new PersonDTO();
		
		//ModelMapper modelMapper = new ModelMapper();
		
		//modelMapper.map(person, convertedPerson);
 		personList.add(person);
		return new ResponseEntity<> ("Person added", HttpStatus.OK);
	}
	

	@PostMapping("/persons/new")
	public ResponseEntity<String> addPersons(@RequestBody List<Person> persons) {
		personList.addAll(persons);
		return new ResponseEntity<> ("Person added", HttpStatus.OK);
	}
}
