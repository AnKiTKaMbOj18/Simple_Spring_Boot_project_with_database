package kamboj.ankit.springBootSecurity.services;

import kamboj.ankit.springBootSecurity.api.dto.DepartmentDto;
import kamboj.ankit.springBootSecurity.domain.Department;

public interface DepartmentService {
	
	Department saveDepartment(DepartmentDto departmentDto);

	Department getDepartment(Long id);

}
