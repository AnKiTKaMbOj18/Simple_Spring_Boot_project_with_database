package kamboj.ankit.springBootProject.service;

import java.util.List;

import kamboj.ankit.springBootProject.api.dto.PersonDto;
import kamboj.ankit.springBootProject.domain.Person;

public interface PersonService {

	List<Person> getAllPersons();

	Person getPerson(Long id);

	Long addPerson(PersonDto personDto);

	String updatePerson(Person person, Long id);

	String deletePerson(Long id);

}
