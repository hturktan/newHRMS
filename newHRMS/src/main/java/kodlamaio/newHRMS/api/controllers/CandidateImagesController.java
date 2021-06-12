package kodlamaio.newHRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.net.MediaType;

import kodlamaio.newHRMS.business.abstracts.CandidateImageService;
import kodlamaio.newHRMS.business.abstracts.CandidateService;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.Candidate;
import kodlamaio.newHRMS.entities.concretes.CandidateImage;



@RestController
@RequestMapping(name = "/api/candidateimages")
public class CandidateImagesController {

	private CandidateImageService candidateImageService;
	private CandidateService candidateService;

	@Autowired
	public CandidateImagesController(CandidateImageService candidateImageService, CandidateService candidateService) {
		super();
		this.candidateImageService = candidateImageService;
		this.candidateService = candidateService;
	}
	
//    @PostMapping(value = "/add")
//    public ResponseEntity<?> add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile) {
//        CandidateImage candidateImage = new CandidateImage();
//        Candidate candidate = new Candidate();
//        candidateImage.setCandidate(candidate);
//        return ResponseEntity.ok(this.candidateImageService.add(candidateImage, imageFile));
//    }
	
	@PostMapping(value = "/add")
	public Result add(@RequestParam(value = "id") int candidateId, @RequestParam(value = "imageFile") MultipartFile imageFile) {
		Candidate candidate = (Candidate) this.candidateService.getById(candidateId).getData();
		CandidateImage candidateImage = new CandidateImage();
		candidateImage.setId(candidateId);
		return this.candidateImageService.add(candidateImage, imageFile);
	}
		    
    @PostMapping(value = "/delete")
    public ResponseEntity<?> delete(@RequestParam("id") int candidateId) {
        CandidateImage candidateImage = new CandidateImage();
        Candidate candidate = new Candidate();
        candidate.setId(candidateId);
        return ResponseEntity.ok(this.candidateImageService.delete(candidateId));
    }
    
    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.candidateImageService.getAll());
    }
    
    @GetMapping("/getbycandidateid")
    public ResponseEntity<?> getByCandidateId(int candidateId){
    	return ResponseEntity.ok(this.candidateImageService.getByCandidateId(candidateId));
    }
	
}
