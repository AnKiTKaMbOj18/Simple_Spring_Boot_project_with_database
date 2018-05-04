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

import kamboj.ankit.SpringBootDemoProject.aNew.entityclass.Subject;
import kamboj.ankit.SpringBootDemoProject.aNew.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping("/")
	public List<Subject> getAllSubjects(){
		return subjectService.getAllSubjects();
	}
	
	@GetMapping("/{subjectid}")
	public Subject getSubject(@PathVariable Long subjectid) {
		return subjectService.getSubject(subjectid);
	}
	
	@PostMapping
	public Long addSubject(@RequestBody Subject subject) {
		return subjectService.addSubject(subject);
	}
	
	@PutMapping("/{subjectid}")
	public String updateSubject(@RequestBody Subject subject,@PathVariable Long subjectid) {
		return subjectService.updateSubject(subject,subjectid);
	}
	
	@DeleteMapping("/{subjectid")
	public String deleteSubject(@PathVariable Long subjectid) {
		return subjectService.deleteSubject(subjectid);
	}

}
