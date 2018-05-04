package kamboj.ankit.SpringBootDemoProject.bNew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kamboj.ankit.SpringBootDemoProject.bNew.entityclass.Employee;
import kamboj.ankit.SpringBootDemoProject.bNew.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/{eid}")
	public Employee getEmployee(@PathVariable Long eid) {
		return employeeService.getEmployee(eid);
	}
	
	@PostMapping
	public Long addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/{eid}")
	public String updateEmployee(@RequestBody Employee employee,@PathVariable Long eid) {
		return employeeService.updateEmployee(employee,eid);
	}
	
	@DeleteMapping("{eid}")
	public String deleteEmployee(@PathVariable Long eid) {
		return employeeService.deleteEmployee(eid);
	}
}
