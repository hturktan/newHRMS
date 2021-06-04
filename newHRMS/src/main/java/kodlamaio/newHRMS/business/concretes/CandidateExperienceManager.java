package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.CandidateExperienceService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.CandidateExperienceDao;
import kodlamaio.newHRMS.entities.concretes.CandidateEducation;
import kodlamaio.newHRMS.entities.concretes.CandidateExperience;
import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

@Service
public class CandidateExperienceManager implements CandidateExperienceService{

	private CandidateExperienceDao candidateExperienceDao;
	
	@Autowired
	public CandidateExperienceManager(CandidateExperienceDao candidateExperienceDao) {
		super();
		this.candidateExperienceDao = candidateExperienceDao;
	}

	@Override
	public Result add(CandidateExperience candidateExperience) {
		this.candidateExperienceDao.save(candidateExperience);
		return new SuccessResult("Candidate experience is saved");
	}
	
	@Override
	public Result update(CandidateExperience candidateExperience) {
		this.candidateExperienceDao.save(candidateExperience);
		return new SuccessResult("Candidate experience is updated");
	}

	@Override
	public Result delete(int candidateId) {
		this.candidateExperienceDao.deleteById(candidateId);
		return new SuccessResult("Candidate experience is deleted");
	}

	@Override
	public DataResult<List<CandidateExperience>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"finishDate");
		return new SuccessDataResult<List<CandidateExperience>>(this.candidateExperienceDao.findAll(sort));
	}

	@Override
	public DataResult<List<CandidateExperience>> getAllByCandidateIdOrderByFinishDate(int candidateId) {
		
		return new SuccessDataResult<List<CandidateExperience>>(this.candidateExperienceDao.getAllByCandidateIdOrderByFinishDate(candidateId));
	}

	@Override
	public DataResult<List<CandidateExperience>> getAllByCandidateId(int candidateId) {

		return new SuccessDataResult<List<CandidateExperience>>(this.candidateExperienceDao.getAllByCandidateId(candidateId));
	}



}
