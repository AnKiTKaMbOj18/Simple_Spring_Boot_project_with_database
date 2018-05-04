package kamboj.ankit.springBootSecurity.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kamboj.ankit.springBootSecurity.api.dto.DepartmentDto;
import kamboj.ankit.springBootSecurity.domain.Department;
import kamboj.ankit.springBootSecurity.services.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public Department createDepartment(@RequestBody DepartmentDto departmentDto) {
		return departmentService.saveDepartment(departmentDto);
	}
	
	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable Long id) {
		return departmentService.getDepartment(id);
	}
	
}