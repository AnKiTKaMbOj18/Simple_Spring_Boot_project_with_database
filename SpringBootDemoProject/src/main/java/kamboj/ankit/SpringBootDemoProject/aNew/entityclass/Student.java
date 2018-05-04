package kamboj.ankit.SpringBootDemoProject.aNew.entityclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentid;
	private String studentname;
	
	
	public Long getStudentid() {
		return studentid;
	}
	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + "]";
	}
	
}
