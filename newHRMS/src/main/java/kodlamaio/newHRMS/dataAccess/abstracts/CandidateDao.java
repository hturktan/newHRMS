package kodlamaio.newHRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	
	Candidate findCandidateByNationalId(String nationalId);
	List<Candidate> getById(int candidateId);
}
