package kamboj.ankit.springBootProject.api.controller;

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

import kamboj.ankit.springBootProject.api.dto.MobileDto;
import kamboj.ankit.springBootProject.domain.Mobile;
import kamboj.ankit.springBootProject.service.MobileService;

@RestController
@RequestMapping("/mobiles")
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	@GetMapping("/")
	public List<Mobile> getAllMobiles(){
		return mobileService.getAllMobiles();
	}
	
	@GetMapping("/{id}")
	public Mobile getMobile(@PathVariable Long id) {
		return mobileService.getMobile(id);
	}
	
	@PostMapping
	public Long addMobile(@RequestBody MobileDto mobileDto) {
		return mobileService.addMobile(mobileDto);
	}
	
	@PutMapping("/{id}")
	public String updateMobile(@RequestBody Mobile mobile,@PathVariable Long id) {
		return mobileService.updateMobile(mobile,id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteMobile(@PathVariable Long id) {
		return mobileService.deleteMobile(id);
	}
}
