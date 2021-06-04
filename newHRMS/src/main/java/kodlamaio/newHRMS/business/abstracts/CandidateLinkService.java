package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.CandidateLink;

public interface CandidateLinkService {
	
	Result add(CandidateLink candidateLink);
	Result update(CandidateLink candidateLink);
	Result delete(int candidateId);
	DataResult<List<CandidateLink>> getAll();
	DataResult<List<CandidateLink>> getAllByCandidateId(int candidateId);
}
