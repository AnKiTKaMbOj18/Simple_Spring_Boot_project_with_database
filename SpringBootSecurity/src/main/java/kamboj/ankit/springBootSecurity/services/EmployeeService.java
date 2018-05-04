package kamboj.ankit.springBootSecurity.services;

import kamboj.ankit.springBootSecurity.api.dto.EmployeeDto;
import kamboj.ankit.springBootSecurity.domain.Employee;

public interface EmployeeService {

	Employee saveEmployee(EmployeeDto employeeDto);
}
