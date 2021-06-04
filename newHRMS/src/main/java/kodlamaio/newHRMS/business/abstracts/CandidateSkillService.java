package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

public interface CandidateSkillService {
	
	Result add(CandidateSkill candidateSkill);
	Result update(CandidateSkill candidateSkill);
	Result delete(int candidateId);
	DataResult<List<CandidateSkill>> getAll();
	DataResult<List<CandidateSkill>> getAllByCandidateId(int candidateId);
}
