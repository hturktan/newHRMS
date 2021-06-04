package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.CandidateLinkService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.CandidateLinkDao;
import kodlamaio.newHRMS.entities.concretes.CandidateLink;

@Service
public class CandidateLinkManager implements CandidateLinkService{

	private CandidateLinkDao candidateLinkDao;
	
	@Autowired
	public CandidateLinkManager(CandidateLinkDao candidateLinkDao) {
		super();
		this.candidateLinkDao = candidateLinkDao;
	}

	@Override
	public Result add(CandidateLink candidateLink) {
		this.candidateLinkDao.save(candidateLink);
		return new SuccessResult("Candidate link is saved");
	}
	
	@Override
	public Result update(CandidateLink candidateLink) {
		this.candidateLinkDao.save(candidateLink);
		return new SuccessResult("Candidate link is updated");
	}

	@Override
	public Result delete(int candidateId) {
		this.candidateLinkDao.deleteById(candidateId);
		return new SuccessResult("Candidate link is deleted");
	}

	@Override
	public DataResult<List<CandidateLink>> getAll() {
		
		return new SuccessDataResult<List<CandidateLink>>(this.candidateLinkDao.findAll());
	}

	@Override
	public DataResult<List<CandidateLink>> getAllByCandidateId(int candidateId) {
		
		return new SuccessDataResult<List<CandidateLink>>(this.candidateLinkDao.getAllByCandidateId(candidateId));
	}





}
