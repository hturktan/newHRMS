package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.CandidateExperience;
import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

public interface CandidateExperienceService {
	Result add(CandidateExperience candidateExperience);
	Result update(CandidateExperience candidateExperience);
	Result delete(int candidateId);
	DataResult<List<CandidateExperience>> getAllSorted();
	DataResult<List<CandidateExperience>> getAllByCandidateIdOrderByFinishDate(int candidateId);
	DataResult<List<CandidateExperience>> getAllByCandidateId(int candidateId);
}
