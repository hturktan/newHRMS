package kodlamaio.newHRMS.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.CandidateEducationService;
import kodlamaio.newHRMS.entities.concretes.CandidateEducation;

@RestController
@RequestMapping("/api/candidateeducations")
public class CandidateEducationsController {
	
	private CandidateEducationService candidateEducationService;

	public CandidateEducationsController(CandidateEducationService candidateEducationService) {
		super();
		this.candidateEducationService = candidateEducationService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateEducation candidateEducation){
		return ResponseEntity.ok(this.candidateEducationService.add(candidateEducation));
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody CandidateEducation candidateEducation){
		return ResponseEntity.ok(this.candidateEducationService.update(candidateEducation));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam("id") int candidateId){
		return ResponseEntity.ok(this.candidateEducationService.delete(candidateId));
	}
	
	@GetMapping("/getallsorted")
	public ResponseEntity<?> getAllSorted(){
		return ResponseEntity.ok(this.candidateEducationService.getAllSorted());
	}
	
	@GetMapping("/getallbycandidateidorderbyfinishyear")
	public ResponseEntity<?> getAllByCandidateIdOrderByFinishYear(@RequestParam int candidateID){
		return ResponseEntity.ok(this.candidateEducationService.getAllByCandidateIdOrderByFinishYear(candidateID));
	}
}
