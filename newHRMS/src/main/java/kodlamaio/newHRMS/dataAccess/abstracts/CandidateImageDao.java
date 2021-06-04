package kodlamaio.newHRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.CandidateImage;

public interface CandidateImageDao extends JpaRepository<CandidateImage, Integer>{
	
	CandidateImage getById(int id);
	List<CandidateImage> getByCandidateId(int candidateId);

}
