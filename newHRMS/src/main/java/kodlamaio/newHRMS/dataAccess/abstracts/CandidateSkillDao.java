package kodlamaio.newHRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

public interface CandidateSkillDao extends JpaRepository<CandidateSkill, Integer> {
	List<CandidateSkill> getAllByCandidateId(int candidateId);
}
