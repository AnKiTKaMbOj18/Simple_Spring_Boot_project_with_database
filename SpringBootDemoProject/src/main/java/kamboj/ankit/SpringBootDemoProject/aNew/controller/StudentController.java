package kamboj.ankit.SpringBootDemoProject.aNew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kamboj.ankit.SpringBootDemoProject.aNew.entityclass.Student;
import kamboj.ankit.SpringBootDemoProject.aNew.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{studentid}")
	public Student getStudent(@PathVariable Long studentid) {
		return studentService.getStudent(studentid);
	}
	
	@PostMapping
	public Long addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PutMapping("/{studentid}")
	public String updateStudent(@PathVariable Long studentid,@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/{studentid}")
	public String deleteStudent(@PathVariable Long studentid) {
		return studentService.deleteStudent(studentid);
	}
}
