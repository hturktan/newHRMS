package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.CandidateEducation;
import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

public interface CandidateEducationService {

	Result add(CandidateEducation candidateEducation);
	Result update(CandidateEducation candidateEducation);
	Result delete(int candidateId);
	DataResult<List<CandidateEducation>> getAllSorted();
	DataResult<List<CandidateEducation>> getAllByCandidateIdOrderByFinishYear(int candidateId);
	DataResult<List<CandidateEducation>> getAllByCandidateId(int candidateId);
}
