package kamboj.ankit.SpringBootDemoProject.aNew.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.SpringBootDemoProject.aNew.dto.MarksDto;
import kamboj.ankit.SpringBootDemoProject.aNew.entityclass.Marks;
import kamboj.ankit.SpringBootDemoProject.aNew.entityclass.Student;
import kamboj.ankit.SpringBootDemoProject.aNew.entityclass.Subject;
import kamboj.ankit.SpringBootDemoProject.aNew.repository.MarksRepository;

@Service
public class MarksService {

	@Autowired
	private MarksRepository marksRepository;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SubjectService subjectService;
	

	public List<Marks> getAllMarks() {
		List<Marks> marks=new ArrayList<>();
		marksRepository.findAll()
		.forEach(marks::add);
		return marks;
	}

	public Marks getMark(Long marksid) {
		return marksRepository.findOne(marksid);
	}

	public Long addMark(MarksDto marksdto) {
		Marks marks=new Marks();
		Student students=studentService.getStudent(marksdto.getStudentId());
		Subject subjects=subjectService.getSubject(marksdto.getSubjectId());
		marks.setStudent(students);
		marks.setSubject(subjects);
		
		marksRepository.save(marks);
		return marks.getMarksid();
	}

	public String updateMark(Marks marks, Long marksid) {
		marksRepository.save(marks);
		return "updated";
	}

	public String deleteMark(Long marksid) {
		marksRepository.delete(marksid);
		return "deleted";
	}
	
}
