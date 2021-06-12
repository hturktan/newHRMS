package kodlamaio.newHRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.JobAdvertService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.entities.concretes.JobAdvert;

@CrossOrigin
@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertControllers {

	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertControllers(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		
		return this.jobAdvertService.add(jobAdvert);
	}
	
	@PostMapping("/delete")
	public Result delete(int jobAdvertId) {
		
		return this.jobAdvertService.delete(jobAdvertId);
	}
	
	@PostMapping("/adjustfromopentoclose")
	public Result adjustFromOpenToClose(@RequestParam int id) {
		
		return this.jobAdvertService.adjustFromOpenToClose(id);
	}
	
	@PostMapping("/getbyid")
	public DataResult<JobAdvert> getById(@RequestParam int id) {
		
		return this.jobAdvertService.getById(id);
	}
	
	@PostMapping("/getall")
	public DataResult<List<JobAdvert>> getAll() {
		
		return this.jobAdvertService.getAll();
		
	}
	
	@PostMapping("/findallopenjobadvertlist")
	public DataResult<List<JobAdvert>> findAllOpenJobAdvertList() {
		
		return this.jobAdvertService.findAllOpenJobAdvertList();
	}
	
	@PostMapping("/getallbyorderbypublisheddate")
	public DataResult<List<JobAdvert>> getAllByOrderByPublishedDate(){
		
		return this.jobAdvertService.getAllByOrderByPublishedDate();
	}
	
	@PostMapping("/getallopenjobadvertbyemployer")
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(@RequestParam int id) {
		
		return this.jobAdvertService.getAllOpenJobAdvertByEmployer(id);
	}
		
}
