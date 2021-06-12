package kodlamaio.newHRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.WorkingHourService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.WorkingHour;

@RestController
@RequestMapping("/api/workinghours")
public class WorkingHoursController {
	
	private WorkingHourService workingHourService;

	@Autowired
	public WorkingHoursController(WorkingHourService workingHourService) {
		super();
		this.workingHourService = workingHourService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody WorkingHour workingHour) {
		return this.workingHourService.add(workingHour);
	}
	
	@PostMapping("/delete")
	public Result delete(WorkingHour workingHour) {
		
		return this.workingHourService.delete(workingHour);
	}
	
	@GetMapping("/getall")
	public DataResult<List<WorkingHour>> getAll(){
		return this.workingHourService.getAll();
	}
		
	
}
