package kodlamaio.newHRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.CandidateLinkService;
import kodlamaio.newHRMS.entities.concretes.CandidateLink;

@RestController
@RequestMapping("/api/candidatelinks")
public class CandidateLinksController {
	
	private CandidateLinkService candidateLinkService;

	@Autowired
	public CandidateLinksController(CandidateLinkService candidateLinkService) {
		super();
		this.candidateLinkService = candidateLinkService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateLink candidateLink){
		return ResponseEntity.ok(this.candidateLinkService.add(candidateLink));
	}
	
	@PostMapping("update")
	public ResponseEntity<?> update(@RequestBody CandidateLink candidateLink){
		return ResponseEntity.ok(this.candidateLinkService.update(candidateLink));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam("id") int candidateId){
		return ResponseEntity.ok(this.candidateLinkService.delete(candidateId));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.candidateLinkService.getAll());
	}
	
	@GetMapping("/getallbycandidateid")
	public ResponseEntity<?> getAllByCandidateId(@RequestParam int candidateID){
		return ResponseEntity.ok(this.candidateLinkService.getAllByCandidateId(candidateID));
	}
}
