package kamboj.ankit.SpringBootDemoProject.aNew.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.SpringBootDemoProject.aNew.entityclass.Student;
import kamboj.ankit.SpringBootDemoProject.aNew.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	public Student getStudent(Long studentid) {

		return studentRepository.findOne(studentid);
	}

	public Long addStudent(Student student) {
		studentRepository.save(student);
		return student.getStudentid();
	}

	public String updateStudent(Student student) {
		studentRepository.save(student);
		return "updated";
	}

	public String deleteStudent(Long studentid) {
		studentRepository.delete(studentid);
		return "deleted";
	}

}
