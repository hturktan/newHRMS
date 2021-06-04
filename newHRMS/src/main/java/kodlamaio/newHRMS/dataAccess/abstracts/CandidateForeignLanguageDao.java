package kodlamaio.newHRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.CandidateForeignLanguage;

public interface CandidateForeignLanguageDao extends JpaRepository<CandidateForeignLanguage, Integer> {
	CandidateForeignLanguage getById(int id);
	List<CandidateForeignLanguage> getAllByCandidateId(int candidateId);
}
