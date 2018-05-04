package kamboj.ankit.springBootSecurity.api.dto;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {

	private String name;
	private List<DepartmentDto> departments = new ArrayList<>();

	public String getName () {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DepartmentDto> getDepartments() {
		return departments;
	}

	public void setDepartments(List<DepartmentDto> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "EmployeeDto [name=" + name + ", departments=" + departments + ", getName()=" + getName()
				+ ", getDepartments()=" + getDepartments() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
