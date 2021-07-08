package restexample.eteration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	List<Person> personList = new ArrayList<>();
	
	@GetMapping("/")
	public String home() {
		return "API Working!";
	}
	
	@GetMapping("/persons")
	public List<Person> getPersons(){
		return personList;
	}
	
	@PostMapping("/person/new")
	public String addPerson(@RequestBody Person person) {
		personList.add(person);
		return "Person added";
	}
	/*
	@RequestMapping(value = "/person/new", method = RequestMethod.POST)
	public String addPerson(@RequestBody Person person) {
		personList.add(person);
		return "Person added";
	}
	*/
	@PostMapping("/persons/new")
	public String addPersons(@RequestBody List<Person> persons) {
		personList.addAll(persons);
		return "Persons added";
	}
}
