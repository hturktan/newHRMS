package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.Candidate;
import kodlamaio.newHRMS.entities.dtos.CandidateResumeDto;

public interface CandidateService {
	
	Result add(Candidate candidate);
	Result update(Candidate candidate);
	Result delete(int candidateId);
	DataResult<List<Candidate>> getAll();
	DataResult<List<Candidate>> getById(int candidateId);
	DataResult<Candidate> getCandidateByNationalId(String nationalId);
	DataResult<CandidateResumeDto> getCandidateResumeById(int candidateId);
	
}
