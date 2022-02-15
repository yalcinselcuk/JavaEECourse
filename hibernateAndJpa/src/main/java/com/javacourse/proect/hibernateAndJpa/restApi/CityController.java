package com.javacourse.proect.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.proect.hibernateAndJpa.Business.ICityService;
import com.javacourse.proect.hibernateAndJpa.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {

	private ICityService cityService;
	
	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@RequestMapping("/cities")
	public List<City> get(){
		return cityService.getAll();
	}
	
}
