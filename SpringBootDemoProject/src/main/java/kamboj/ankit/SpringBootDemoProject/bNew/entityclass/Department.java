package kamboj.ankit.SpringBootDemoProject.bNew.entityclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long did;
	private String dname;
	
	@ManyToOne
	@JoinColumn(name="eid")
	private Employee employee;
	
	public Department() {
		
	}

	public Department(Long did, String dname, Employee employee) {
		
		this.did = did;
		this.dname = dname;
		this.employee = employee;
	}

	public Long getDid() {
		return did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", employee=" + employee + "]";
	}
	
}
