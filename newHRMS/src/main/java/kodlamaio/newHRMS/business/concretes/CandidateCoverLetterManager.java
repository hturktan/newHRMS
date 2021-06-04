package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.CandidateCoverLetterService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.CandidateCoverLetterDao;
import kodlamaio.newHRMS.entities.concretes.CandidateCoverLetter;

@Service
public class CandidateCoverLetterManager implements CandidateCoverLetterService {

	private CandidateCoverLetterDao candidateCoverLetterDao;
	
	@Autowired
	public CandidateCoverLetterManager(CandidateCoverLetterDao candidateCoverLetterDao) {
		super();
		this.candidateCoverLetterDao = candidateCoverLetterDao;
	}

	@Override
	public Result add(CandidateCoverLetter candidateCoverLetter) {
		this.candidateCoverLetterDao.save(candidateCoverLetter);
		return new SuccessResult("Candidate cover letter is added");
	}

	@Override
	public Result update(CandidateCoverLetter candidateCoverLetter) {
		this.candidateCoverLetterDao.save(candidateCoverLetter);
		return new SuccessResult("Candidate cover letter is updated");
	}

	@Override
	public Result delete(int id) {
		this.candidateCoverLetterDao.deleteById(id);;
		return new SuccessResult("Candidate cover letter is deleted");
	}

	@Override
	public DataResult<List<CandidateCoverLetter>> getAll() {
		
		return new SuccessDataResult<List<CandidateCoverLetter>>(this.candidateCoverLetterDao.findAll());
	}

	@Override
	public DataResult<List<CandidateCoverLetter>> getAllByCandidateId(int candidateId) {

		return new SuccessDataResult<List<CandidateCoverLetter>>(this.candidateCoverLetterDao.getAllByCandidateId(candidateId));
	}


}
