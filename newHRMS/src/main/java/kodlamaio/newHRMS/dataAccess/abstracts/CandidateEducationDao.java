package kodlamaio.newHRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.CandidateEducation;
import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

public interface CandidateEducationDao extends JpaRepository<CandidateEducation, Integer>{
	List<CandidateEducation> getAllById(int id);
	List<CandidateEducation> getAllByCandidateIdOrderByFinishYear(int candidateId);
	List<CandidateEducation> getAllByCandidateId(int candidateId);

}
