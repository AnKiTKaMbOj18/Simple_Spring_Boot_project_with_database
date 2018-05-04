package kamboj.ankit.springBootProject.api.dto;

import java.util.ArrayList;
import java.util.List;

public class PersonDto {

	private String name;
	
	private List<MobileDto> mobiles=new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MobileDto> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<MobileDto> mobiles) {
		this.mobiles = mobiles;
	}
	
	
}
