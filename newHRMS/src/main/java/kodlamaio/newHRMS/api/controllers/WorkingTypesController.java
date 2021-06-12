package kodlamaio.newHRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.WorkingTypeService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.WorkingHour;
import kodlamaio.newHRMS.entities.concretes.WorkingType;

@RestController
@RequestMapping("/api/workingtypes")
public class WorkingTypesController {

	@Autowired
	private WorkingTypeService workingTypeService;

	public WorkingTypesController(WorkingTypeService workingTypeService) {
		super();
		this.workingTypeService = workingTypeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody WorkingType workingType) {
		return this.workingTypeService.add(workingType);
	}
	
	@PostMapping("/delete")
	public Result delete(WorkingType workingType) {
		
		return this.workingTypeService.delete(workingType);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<WorkingType>> getAll(){
		return this.workingTypeService.getAll();
	}
}
