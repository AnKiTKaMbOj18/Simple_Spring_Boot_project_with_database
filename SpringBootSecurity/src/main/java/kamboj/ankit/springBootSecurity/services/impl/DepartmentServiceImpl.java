package kamboj.ankit.springBootSecurity.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.springBootSecurity.api.dto.DepartmentDto;
import kamboj.ankit.springBootSecurity.api.repositories.DepartmentRepository;
import kamboj.ankit.springBootSecurity.domain.Department;
import kamboj.ankit.springBootSecurity.services.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository; 

	@Override
	@Transactional
	public Department saveDepartment(DepartmentDto departmentDto) {
		Department department = new Department();
		department.setName(departmentDto.getName());
		departmentRepository.save(department);
		return department;
	}

	@Override
	public Department getDepartment(Long id) {
		return departmentRepository.findOne(id);
	}

}
