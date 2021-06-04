package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.CandidateSkillService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.CandidateSkillDao;
import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

@Service
public class CandidateSkillManager implements CandidateSkillService {

	private CandidateSkillDao candidateSkillDao;
	
	@Autowired
	public CandidateSkillManager(CandidateSkillDao candidateSkillDao) {
		super();
		this.candidateSkillDao = candidateSkillDao;
	}

	@Override
	public Result add(CandidateSkill candidateSkill) {
		this.candidateSkillDao.save(candidateSkill);
		return new SuccessResult("Candidate new skill is added");
	}
	
	@Override
	public Result update(CandidateSkill candidateSkill) {
		this.candidateSkillDao.save(candidateSkill);
		return new SuccessResult("Candidate new skill is updated");
	}

	@Override
	public Result delete(int candidateId) {
		this.candidateSkillDao.deleteById(candidateId);
		return new SuccessResult("Candidate new skill is deleted");
	}

	@Override
	public DataResult<List<CandidateSkill>> getAll() {
		
		return new SuccessDataResult<List<CandidateSkill>>(this.candidateSkillDao.findAll());
	}

	@Override
	public DataResult<List<CandidateSkill>> getAllByCandidateId(int candidateId) {

		return new SuccessDataResult<List<CandidateSkill>>(this.candidateSkillDao.getAllByCandidateId(candidateId));
	}



}
