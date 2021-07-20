package restexample.eteration.mapper;

import org.mapstruct.Mapper;

import restexample.eteration.dto.PersonDTO;
import restexample.eteration.model.Person;

@Mapper
public interface PersonMapper {
	PersonDTO personToDto(Person person); 
}
