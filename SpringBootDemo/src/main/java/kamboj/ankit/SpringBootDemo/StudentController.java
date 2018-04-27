package kamboj.ankit.SpringBootDemo;

import java.util.ArrayList;
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

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	
	@GetMapping("/")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
	}
	
	@PostMapping
	public int createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@PutMapping("/{id}")
	public String updateStudent(@RequestBody Student student,@PathVariable int id) {
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
		
	}
}
