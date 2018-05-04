package kamboj.ankit.SpringBootDemoProject.bNew.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.SpringBootDemoProject.bNew.dto.DepartmentDto;
import kamboj.ankit.SpringBootDemoProject.bNew.entityclass.Department;
import kamboj.ankit.SpringBootDemoProject.bNew.entityclass.Employee;
import kamboj.ankit.SpringBootDemoProject.bNew.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	DepartmentService(){
		System.out.println("default constructor");
	}
	
	@PostConstruct
	private void setUp() {
		System.out.println("postConstruct");
	}

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private EmployeeService employeeService;

	public List<Department> getAllDepartments() {
		List<Department> departments=new ArrayList<>();
		departmentRepository.findAll()
		.forEach(departments::add);
		return departments;
	}

	public Department getDepartment(Long did) {
		return departmentRepository.findOne(did);
	}

	public Long addDepartment(DepartmentDto departmentDto) {
		
		Department department=new Department();
		
		Employee employee=employeeService.getEmployee(departmentDto.getEid());
		department.setDname(departmentDto.getName());
		department.setEmployee(employee);
		
		departmentRepository.save(department);
		return department.getDid();
	}

	public String updateDepartment(Department department, Long did) {
		departmentRepository.save(department);
		return "updated";
	}

	public String deleteDepartment(Long did) {
		departmentRepository.delete(did);
		return "deleted";
	}
	
	
}
