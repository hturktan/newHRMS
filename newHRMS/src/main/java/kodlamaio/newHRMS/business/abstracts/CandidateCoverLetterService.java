package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.CandidateCoverLetter;

public interface CandidateCoverLetterService {
	
	Result add(CandidateCoverLetter candidateCoverLetter);
	Result update(CandidateCoverLetter candidateCoverLetter);
	Result delete(int id);
	DataResult<List<CandidateCoverLetter>> getAll();
	DataResult<List<CandidateCoverLetter>> getAllByCandidateId(int candidateId);
}
