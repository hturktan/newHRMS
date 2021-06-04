package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.CandidateForeignLanguageService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.CandidateForeignLanguageDao;
import kodlamaio.newHRMS.entities.concretes.CandidateForeignLanguage;

@Service
public class CandidateForeignLanguageManager implements CandidateForeignLanguageService{

	private CandidateForeignLanguageDao candidateForeignLanguageDao;
	
	@Autowired
	public CandidateForeignLanguageManager(CandidateForeignLanguageDao candidateForeignLanguageDao) {
		super();
		this.candidateForeignLanguageDao = candidateForeignLanguageDao;
	}

	@Override
	public Result add(CandidateForeignLanguage candidateForeignLanguage) {
		this.candidateForeignLanguageDao.save(candidateForeignLanguage);
		return new SuccessResult("Candidate foreign language data is saved");
	}

	@Override
	public Result update(CandidateForeignLanguage candidateForeignLanguage) {
		this.candidateForeignLanguageDao.save(candidateForeignLanguage);
		return new SuccessResult("Candidate foreign language data is updated");
	}

	@Override
	public Result delete(int candidateId) {
		this.candidateForeignLanguageDao.deleteById(candidateId);
		return new SuccessResult("Candidate foreign language data is deleted");
	}
	@Override
	public DataResult<List<CandidateForeignLanguage>> getAll() {
		
		return new SuccessDataResult<List<CandidateForeignLanguage>>(this.candidateForeignLanguageDao.findAll());
	}

	@Override
	public DataResult<List<CandidateForeignLanguage>> getAllByCandidateId(int candidateId) {
		
		return new SuccessDataResult<List<CandidateForeignLanguage>>(this.candidateForeignLanguageDao.getAllByCandidateId(candidateId));
	}



}

