package kodlamaio.newHRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.CandidateExperienceService;
import kodlamaio.newHRMS.entities.concretes.CandidateExperience;

@RestController
@RequestMapping("/api/candidatexperiences")
public class CandidateExperiencesController {
	
	private CandidateExperienceService candidateExperienceService;

	@Autowired
	public CandidateExperiencesController(CandidateExperienceService candidateExperienceService) {
		super();
		this.candidateExperienceService = candidateExperienceService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateExperience candidateExperience){
		return ResponseEntity.ok(this.candidateExperienceService.add(candidateExperience));
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody CandidateExperience candidateExperience){
		return ResponseEntity.ok(this.candidateExperienceService.update(candidateExperience));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam("id") int candidateId){
		return ResponseEntity.ok(this.candidateExperienceService.delete(candidateId));
	}
	
	@GetMapping("/getallsorted")
	public ResponseEntity<?> getAllSorted(){
		return ResponseEntity.ok(this.candidateExperienceService.getAllSorted());
	}
	
	@GetMapping("/getallbycandidateidorderbyfinishdate")
	public ResponseEntity<?> getAllByCandidateIdOrderByFinishDate(@RequestParam int candidateID){
		return ResponseEntity.ok(this.candidateExperienceService.getAllByCandidateIdOrderByFinishDate(candidateID));
	}
	
}

