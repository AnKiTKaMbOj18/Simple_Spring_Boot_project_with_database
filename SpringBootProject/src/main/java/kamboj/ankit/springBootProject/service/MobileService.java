package kamboj.ankit.springBootProject.service;

import java.util.List;

import kamboj.ankit.springBootProject.api.dto.MobileDto;
import kamboj.ankit.springBootProject.domain.Mobile;

public interface MobileService {

	List<Mobile> getAllMobiles();

	Mobile getMobile(Long id);

	Long addMobile(MobileDto mobileDto);

	String updateMobile(Mobile mobile, Long id);

	String deleteMobile(Long id);

}
