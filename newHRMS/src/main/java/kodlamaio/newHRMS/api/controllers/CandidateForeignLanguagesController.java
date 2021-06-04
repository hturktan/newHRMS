package kodlamaio.newHRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.CandidateForeignLanguageService;
import kodlamaio.newHRMS.entities.concretes.CandidateForeignLanguage;

@RestController
@RequestMapping("/api/candidateforeignlanguages")
public class CandidateForeignLanguagesController {
	
	private CandidateForeignLanguageService candidateForeignLanguageService;
	
	@Autowired
	public CandidateForeignLanguagesController(CandidateForeignLanguageService candidateForeignLanguageService) {
		super();
		this.candidateForeignLanguageService = candidateForeignLanguageService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateForeignLanguage candidateForeignLanguage){
		return ResponseEntity.ok(this.candidateForeignLanguageService.add(candidateForeignLanguage));
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody CandidateForeignLanguage candidateForeignLanguage){
		return ResponseEntity.ok(this.candidateForeignLanguageService.add(candidateForeignLanguage));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam("id") int candidateId){
		return ResponseEntity.ok(this.candidateForeignLanguageService.delete(candidateId));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.candidateForeignLanguageService.getAll());
	}
	
	@GetMapping("/getallbycandidateid")
	public ResponseEntity<?> getAllByCandidateId(@RequestParam int candidateID){
		return ResponseEntity.ok(this.candidateForeignLanguageService.getAllByCandidateId(candidateID));
	}
}
