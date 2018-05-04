package kamboj.ankit.SpringBootDemoProject.aNew.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.SpringBootDemoProject.aNew.entityclass.Subject;
import kamboj.ankit.SpringBootDemoProject.aNew.repository.SubjectRepository;
@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;
	
	public List<Subject> getAllSubjects() {
		List<Subject> subjects=new ArrayList<>();
		subjectRepository.findAll()
		.forEach(subjects::add);
		return subjects;
	}

	public Subject getSubject(Long subjectid) {
		return subjectRepository.findOne(subjectid);
	}

	public Long addSubject(Subject subject) {
		subjectRepository.save(subject);
		return subject.getSubjectid();
	}

	public String updateSubject(Subject subject, Long subjectid) {
		subjectRepository.save(subject);
		return "updated";
	}

	public String deleteSubject(Long subjectid) {
		subjectRepository.delete(subjectid);
		return "deleted";
	}

}
