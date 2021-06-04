package kodlamaio.newHRMS.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.newHRMS.business.abstracts.CandidateSkillService;
import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

@RestController
@RequestMapping("api/candidateskills")
public class CandidateSkillsController {
	
	private CandidateSkillService candidateSkillService;

	public CandidateSkillsController(CandidateSkillService candidateSkillService) {
		super();
		this.candidateSkillService = candidateSkillService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateSkill candidateSkill){
		return ResponseEntity.ok(this.candidateSkillService.add(candidateSkill));
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody CandidateSkill candidateSkill){
		return ResponseEntity.ok(this.candidateSkillService.update(candidateSkill));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam("id") int candidateId){
		return ResponseEntity.ok(this.candidateSkillService.delete(candidateId));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.candidateSkillService.getAll());
	}
	
	@GetMapping("/getallbycandidateid")
	public ResponseEntity<?> getAllByCandidateId(@RequestParam int candidateID){
		return ResponseEntity.ok(this.candidateSkillService.getAllByCandidateId(candidateID));
	}
	
}
