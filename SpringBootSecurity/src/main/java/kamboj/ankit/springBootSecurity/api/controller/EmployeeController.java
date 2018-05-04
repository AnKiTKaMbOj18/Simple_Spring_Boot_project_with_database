package kamboj.ankit.springBootSecurity.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kamboj.ankit.springBootSecurity.api.dto.EmployeeDto;
import kamboj.ankit.springBootSecurity.domain.Employee;
import kamboj.ankit.springBootSecurity.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee createEmployee(@RequestBody EmployeeDto employeeDto) {
		return employeeService.saveEmployee(employeeDto);
	}
}
