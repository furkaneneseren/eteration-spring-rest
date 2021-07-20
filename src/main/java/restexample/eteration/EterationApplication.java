package restexample.eteration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import restexample.eteration.dto.PersonDTO;
import restexample.eteration.model.Person;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import springfox.documentation.swagger.*;


@SpringBootApplication
public class EterationApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EterationApplication.class, args);
	}
	
	
	
	private static void testMapper() {
		Person testPerson = new Person(1, "Furkan", 22, "student");
		
		PersonDTO testConvertedPerson = new PersonDTO();
		
		ModelMapper modelMapper = new ModelMapper();
		
		modelMapper.map(testPerson, testConvertedPerson);
		
		System.out.println(testConvertedPerson.getId());
		System.out.println(testConvertedPerson.getName());
		System.out.println(testConvertedPerson.getAge());
		System.out.println(testConvertedPerson.getJob());
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		Person testPerson = new Person(1, "Furkan", 22, "student");
		
		PersonDTO testConvertedPerson = new PersonDTO();
		
		ModelMapper modelMapper = new ModelMapper();
		
		modelMapper.map(testPerson, testConvertedPerson);
		String sql = "INSERT INTO person (id, name, age, job) VALUES (?,?,?,?)";
		int result = jdbcTemplate.update(sql, testConvertedPerson.getId(), testConvertedPerson.getName(), testConvertedPerson.getAge(), testConvertedPerson.getJob());
		if (result > 0) {
			System.out.println("new row added");
		}
	}

}
