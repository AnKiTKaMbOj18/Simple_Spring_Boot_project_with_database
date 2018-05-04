package kamboj.ankit.springBootSecurity.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.springBootSecurity.api.dto.DepartmentDto;
import kamboj.ankit.springBootSecurity.api.dto.EmployeeDto;
import kamboj.ankit.springBootSecurity.api.repositories.EmployeeRepository;
import kamboj.ankit.springBootSecurity.domain.Department;
import kamboj.ankit.springBootSecurity.domain.Employee;
import kamboj.ankit.springBootSecurity.services.DepartmentService;
import kamboj.ankit.springBootSecurity.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Override
	public Employee saveEmployee(EmployeeDto employeeDto) {

		Employee employee=new Employee();
		employee.setName(employeeDto.getName());
		
		List<Department> departments=new ArrayList<>();
		for(DepartmentDto departmentDto:employeeDto.getDepartments()) {
		Department dept=departmentService.getDepartment(departmentDto.getId());
		
		departments.add(dept);
		}
		
		employee.setDepartments(departments);
		
		employeeRepository.save(employee);
		
		return employee;
	}
	

}
