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

import kamboj.ankit.SpringBootDemoProject.aNew.dto.MarksDto;
import kamboj.ankit.SpringBootDemoProject.aNew.entityclass.Marks;
import kamboj.ankit.SpringBootDemoProject.aNew.service.MarksService;

@RestController
@RequestMapping("/marks")
public class MarksController {

	@Autowired
	private MarksService marksService;

	@GetMapping("/")
	public List<Marks> getAllMarks() {
		return marksService.getAllMarks();
	}

	@GetMapping("/{marksid}")
	public Marks getMark(@PathVariable Long marksid) {
		return marksService.getMark(marksid);
	}

	@PostMapping
	public Long addMark(@RequestBody MarksDto marksdto) {
		return marksService.addMark(marksdto);
	}

	@PutMapping("/{marksid}")
	public String updateMark(@RequestBody Marks marks, @PathVariable Long marksid) {
		return marksService.updateMark(marks, marksid);
	}
	
	@DeleteMapping("/{marksid}")
	public String deleteMark(@PathVariable Long marksid) {
		return marksService.deleteMark(marksid);
	}
}
