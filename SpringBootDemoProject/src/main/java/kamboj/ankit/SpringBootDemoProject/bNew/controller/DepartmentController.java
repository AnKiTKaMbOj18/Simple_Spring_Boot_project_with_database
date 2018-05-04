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

import kamboj.ankit.SpringBootDemoProject.bNew.dto.DepartmentDto;
import kamboj.ankit.SpringBootDemoProject.bNew.entityclass.Department;
import kamboj.ankit.SpringBootDemoProject.bNew.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/")
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/{did}")
	public Department getDepartment(@PathVariable Long did) {
		return departmentService.getDepartment(did);
	}
	
	@PostMapping
	public Long addDepartment(@RequestBody DepartmentDto departmentDto) {
		return departmentService.addDepartment(departmentDto);
	}
	
	@PutMapping("/{did}")
	public String updateDepartment(@RequestBody Department department,@PathVariable Long did) {
		return departmentService.updateDepartment(department,did);
	}
	
	@DeleteMapping("/{did}")
	public String deleteDepartment(@PathVariable Long did) {
		return departmentService.deleteDepartment(did);
	}
}
