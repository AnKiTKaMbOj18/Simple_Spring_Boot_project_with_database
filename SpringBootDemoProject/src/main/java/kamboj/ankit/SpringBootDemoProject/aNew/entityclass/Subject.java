package kamboj.ankit.SpringBootDemoProject.aNew.entityclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long subjectid;
	private String subjectname;
	private Long subjectmarks;
	
	public Long getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(Long subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public Long getSubjectmarks() {
		return subjectmarks;
	}
	public void setSubjectmarks(Long subjectmarks) {
		this.subjectmarks = subjectmarks;
	}
	
	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", subjectname=" + subjectname + ", subjectmarks=" + subjectmarks
				+ "]";
	}
	
}
