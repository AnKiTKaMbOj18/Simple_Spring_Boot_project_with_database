package kamboj.ankit.springBootProject.api.repositories;

import org.springframework.data.repository.CrudRepository;

import kamboj.ankit.springBootProject.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
