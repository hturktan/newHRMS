package kodlamaio.newHRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.CandidateService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.Candidate;
import kodlamaio.newHRMS.entities.dtos.CandidateResumeDto;

@CrossOrigin
@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	private CandidateService candidateService;
	
	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}
	
	@PostMapping("/delete")
	public Result delete(int candidateId) {
		return this.candidateService.delete(candidateId);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
	}
	
	@GetMapping("/getcandidateresumebyid")
	public DataResult<CandidateResumeDto> getCandidateResumeById(@RequestParam int candidateId){
		return this.candidateService.getCandidateResumeById(candidateId);
	}
}
