package kodlamaio.newHRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.CandidateCoverLetter;

public interface CandidateCoverLetterDao extends JpaRepository<CandidateCoverLetter, Integer> {
	CandidateCoverLetter getById(int id);
	List<CandidateCoverLetter> getAllByCandidateId(int candidateId);
}
