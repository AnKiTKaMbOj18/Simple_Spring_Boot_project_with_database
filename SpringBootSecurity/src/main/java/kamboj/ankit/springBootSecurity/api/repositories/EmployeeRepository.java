package kamboj.ankit.springBootSecurity.api.repositories;

import org.springframework.data.repository.CrudRepository;

import kamboj.ankit.springBootSecurity.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
