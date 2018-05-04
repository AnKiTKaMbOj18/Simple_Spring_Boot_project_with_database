package kamboj.ankit.springBootProject.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamboj.ankit.springBootProject.api.dto.MobileDto;
import kamboj.ankit.springBootProject.api.repositories.MobileRepository;
import kamboj.ankit.springBootProject.domain.Mobile;
import kamboj.ankit.springBootProject.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public List<Mobile> getAllMobiles() {
		List<Mobile> mobiles = new ArrayList<>();
		mobileRepository.findAll()
		.forEach(mobiles::add);
		return mobiles;
	}

	@Override
	public Mobile getMobile(Long id) {
	return mobileRepository.findOne(id);
	}

	@Override
	public Long addMobile(MobileDto mobileDto) {
		Mobile mobile=new Mobile();
		mobile.setName(mobileDto.getName());
		mobile.setCost(mobileDto.getCost());
		
		mobileRepository.save(mobile);
		
		return mobile.getId();
	}

	@Override
	public String updateMobile(Mobile mobile, Long id) {
		mobileRepository.save(mobile);
		return null;
	}

	@Override
	public String deleteMobile(Long id) {
		mobileRepository.delete(id);
		return "deleted";
	}

}
