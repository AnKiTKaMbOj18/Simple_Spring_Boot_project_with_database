package kamboj.ankit.SpringBootDemoProject.bNew.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.SpringBootDemoProject.bNew.entityclass.Employee;
import kamboj.ankit.SpringBootDemoProject.bNew.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		List<Employee> employee=new ArrayList<>();
		employeeRepository.findAll()
		.forEach(employee::add);
		return employee;
	}

	public Employee getEmployee(Long eid) {
		return employeeRepository.findOne(eid);
	}

	public Long addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee.getEid();
	}

	public String updateEmployee(Employee employee, Long eid) {
		employeeRepository.save(employee);
		return "updated";
	}

	public String deleteEmployee(Long eid) {
		employeeRepository.delete(eid);
		return "deleted";
	}
	
	
}
