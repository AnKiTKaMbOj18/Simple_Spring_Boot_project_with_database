package kamboj.ankit.SpringBootDemoProject.aNew.repository;

import org.springframework.data.repository.CrudRepository;

import kamboj.ankit.SpringBootDemoProject.aNew.entityclass.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
