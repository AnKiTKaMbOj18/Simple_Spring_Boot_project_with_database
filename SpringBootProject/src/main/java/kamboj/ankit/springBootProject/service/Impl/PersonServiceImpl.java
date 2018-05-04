package kamboj.ankit.springBootProject.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.springBootProject.api.dto.MobileDto;
import kamboj.ankit.springBootProject.api.dto.PersonDto;
import kamboj.ankit.springBootProject.api.repositories.PersonRepository;
import kamboj.ankit.springBootProject.domain.Mobile;
import kamboj.ankit.springBootProject.domain.Person;
import kamboj.ankit.springBootProject.service.MobileService;
import kamboj.ankit.springBootProject.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private MobileService mobileService;
	
	@Override
	public List<Person> getAllPersons() {
		List<Person> persons=new ArrayList<>();
		personRepository.findAll()
		.forEach(persons::add);
		return persons;
	}

	@Override
	public Person getPerson(Long id) {
		return personRepository.findOne(id);
	}

	@Override
	public Long addPerson(PersonDto personDto) {
		Person person=new Person();
		person.setName(personDto.getName());
		
		List<Mobile> mobiles=new ArrayList<>();
		for(MobileDto mobileDto:personDto.getMobiles()) {
			Mobile m=mobileService.getMobile(mobileDto.getId());
			mobiles.add(m);
		}
		person.setMobiles(mobiles);
		personRepository.save(person);
		return person.getId();
	}

	@Override
	public String updatePerson(Person person, Long id) {
		personRepository.save(person);
		return "updated";
	}

	@Override
	public String deletePerson(Long id) {
		personRepository.delete(id);
		return "deleted";
	}
	

}
