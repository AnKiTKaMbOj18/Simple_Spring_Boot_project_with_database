package kamboj.ankit.SpringBootDemoProject.bNew.repository;

import org.springframework.data.repository.CrudRepository;

import kamboj.ankit.SpringBootDemoProject.bNew.entityclass.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
