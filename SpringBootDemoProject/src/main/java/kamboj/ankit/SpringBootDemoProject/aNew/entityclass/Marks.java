package kamboj.ankit.SpringBootDemoProject.aNew.entityclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="marks")
public class Marks {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long marksid;
	
	@OneToOne
	@JoinColumn(name="studentid")
	private Student student;
	
	@OneToOne
	@JoinColumn(name="subjectid")
	private Subject subject;
	
	public Marks() {
		
	}

	public Marks(Long marksid, Student student, Subject subject) {
		this.marksid = marksid;
		this.student = student;
		this.subject = subject;
	}

	public Long getMarksid() {
		return marksid;
	}

	public void setMarksid(Long marksid) {
		this.marksid = marksid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Marks [marksid=" + marksid + ", student=" + student + ", subject=" + subject + "]";
	}
	
}
