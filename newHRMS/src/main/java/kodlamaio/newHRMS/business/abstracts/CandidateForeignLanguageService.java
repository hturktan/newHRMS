package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.CandidateForeignLanguage;

public interface CandidateForeignLanguageService {
	
	Result add(CandidateForeignLanguage candidateForeignLanguage);
	Result update(CandidateForeignLanguage candidateForeignLanguage);
	Result delete(int candidateId);
	DataResult<List<CandidateForeignLanguage>> getAll();
	DataResult<List<CandidateForeignLanguage>> getAllByCandidateId(int candidateId);

}
