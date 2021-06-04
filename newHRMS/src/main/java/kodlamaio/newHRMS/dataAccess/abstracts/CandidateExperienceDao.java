package kodlamaio.newHRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.CandidateExperience;
import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

public interface CandidateExperienceDao extends JpaRepository<CandidateExperience, Integer> {
	CandidateExperience getById(int id);
	List<CandidateExperience> getAllByCandidateIdOrderByFinishDate(int candidateId);
	List<CandidateExperience> getAllByCandidateId(int candidateId);

}
