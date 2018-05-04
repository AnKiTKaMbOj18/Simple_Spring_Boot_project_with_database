package kamboj.ankit.SpringBootDemoProject.bNew.entityclass;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long eid;
	private String ename;
	private String temporaryaddress;
	private String permanentaddress;
	
	@OneToMany(mappedBy="employee",cascade= {CascadeType.ALL})
	private List<Department> department=new ArrayList<>();
	
	public Employee() {
		
	}
	
	public Employee(Long eid, String ename, String temporaryaddress, String permanentaddress,
			List<Department> department) {
		
		this.eid = eid;
		this.ename = ename;
		this.temporaryaddress = temporaryaddress;
		this.permanentaddress = permanentaddress;
		this.department = department;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getTemporaryaddress() {
		return temporaryaddress;
	}

	public void setTemporaryaddress(String temporaryaddress) {
		this.temporaryaddress = temporaryaddress;
	}

	public String getPermanentaddress() {
		return permanentaddress;
	}

	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", temporaryaddress=" + temporaryaddress
				+ ", permanentaddress=" + permanentaddress + ", department=" + department + "]";
	}
	
	

}
