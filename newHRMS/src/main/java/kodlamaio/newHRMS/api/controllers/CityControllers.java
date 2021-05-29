package kodlamaio.newHRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.CityService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.entities.concretes.City;

@RestController
@RequestMapping("/api/city")
public class CityControllers {

	private CityService cityService;

	@Autowired
	public CityControllers(CityService cityService) {
		super();
		this.cityService = cityService;
	}

	@GetMapping("/getall")
	public DataResult<List<City>> getAll() {
		
		return this.cityService.getAll();
	}

}
