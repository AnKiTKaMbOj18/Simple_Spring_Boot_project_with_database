package kamboj.ankit.springBootSecurity.api.repositories;

import org.springframework.data.repository.CrudRepository;

import kamboj.ankit.springBootSecurity.domain.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
