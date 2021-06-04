package kodlamaio.newHRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.CandidateCoverLetterService;
import kodlamaio.newHRMS.entities.concretes.CandidateCoverLetter;

@RestController
@RequestMapping("api/candidatecoverletters")
public class CandidateCoverLettersController {
	
	private CandidateCoverLetterService candidateCoverLetterService;

	@Autowired
	public CandidateCoverLettersController(CandidateCoverLetterService candidateCoverLetterService) {
		super();
		this.candidateCoverLetterService = candidateCoverLetterService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateCoverLetter candidateCoverLetter){
		return ResponseEntity.ok(this.candidateCoverLetterService.add(candidateCoverLetter));
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody CandidateCoverLetter candidateCoverLetter){
		return ResponseEntity.ok(this.candidateCoverLetterService.update(candidateCoverLetter));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam("id") int candidateId){
		return ResponseEntity.ok(this.candidateCoverLetterService.delete(candidateId));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.candidateCoverLetterService.getAll());
	}
	
	@GetMapping("/getallbycandidateid")
	public ResponseEntity<?> getAllByCandidateId(@RequestParam int candidateID){
		return ResponseEntity.ok(this.candidateCoverLetterService.getAllByCandidateId(candidateID));
	}
}
