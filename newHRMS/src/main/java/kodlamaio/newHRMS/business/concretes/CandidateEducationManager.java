package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.CandidateEducationService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.CandidateEducationDao;
import kodlamaio.newHRMS.entities.concretes.CandidateEducation;

@Service
public class CandidateEducationManager implements CandidateEducationService{

	private CandidateEducationDao candidateEducationDao;
	
	@Autowired
	public CandidateEducationManager(CandidateEducationDao candidateEducationDao) {
		super();
		this.candidateEducationDao = candidateEducationDao;
	}

	@Override
	public Result add(CandidateEducation candidateEducation) {
		this.candidateEducationDao.save(candidateEducation);
		return new SuccessResult("Candidate education is saved");
	}
	
	@Override
	public Result update(CandidateEducation candidateEducation) {
		this.candidateEducationDao.save(candidateEducation);
		return new SuccessResult("Candidate education is updated");
	}

	@Override
	public Result delete(int candidateId) {
		this.candidateEducationDao.deleteById(candidateId);
		return new SuccessResult("Candidate education is deleted");
	}

	@Override
	public DataResult<List<CandidateEducation>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"finishYear");
		return new SuccessDataResult<List<CandidateEducation>>(this.candidateEducationDao.findAll(sort));
	}

	@Override
	public DataResult<List<CandidateEducation>> getAllByCandidateIdOrderByFinishYear(int candidateId) {
		
		return new SuccessDataResult<List<CandidateEducation>>(this.candidateEducationDao.getAllByCandidateIdOrderByFinishYear(candidateId));
	}

	@Override
	public DataResult<List<CandidateEducation>> getAllByCandidateId(int candidateId) {
		
		return new SuccessDataResult<List<CandidateEducation>>(this.candidateEducationDao.getAllByCandidateId(candidateId));
	}

}
