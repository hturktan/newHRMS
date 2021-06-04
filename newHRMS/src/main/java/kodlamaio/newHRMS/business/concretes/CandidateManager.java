package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.CandidateCoverLetterService;
import kodlamaio.newHRMS.business.abstracts.CandidateEducationService;
import kodlamaio.newHRMS.business.abstracts.CandidateExperienceService;
import kodlamaio.newHRMS.business.abstracts.CandidateForeignLanguageService;
import kodlamaio.newHRMS.business.abstracts.CandidateImageService;
import kodlamaio.newHRMS.business.abstracts.CandidateLinkService;
import kodlamaio.newHRMS.business.abstracts.CandidateService;
import kodlamaio.newHRMS.business.abstracts.CandidateSkillService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.CandidateDao;
import kodlamaio.newHRMS.entities.concretes.Candidate;
import kodlamaio.newHRMS.entities.dtos.CandidateResumeDto;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private CandidateCoverLetterService candidateCoverLetterService;
	private CandidateEducationService candidateEducationService;
	private CandidateExperienceService candidateExperienceService;
	private CandidateForeignLanguageService candidateForeignLanguageService;
	private CandidateImageService candidateImageService;
	private CandidateLinkService candidateLinkService;
	private CandidateSkillService candidateSkillService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, CandidateCoverLetterService candidateCoverLetterService,
			CandidateEducationService candidateEducationService, CandidateExperienceService candidateExperienceService,
			CandidateForeignLanguageService candidateForeignLanguageService,
			CandidateImageService candidateImageService, CandidateLinkService candidateLinkService,
			CandidateSkillService candidateSkillService) {
		super();
		this.candidateDao = candidateDao;
		this.candidateCoverLetterService = candidateCoverLetterService;
		this.candidateEducationService = candidateEducationService;
		this.candidateExperienceService = candidateExperienceService;
		this.candidateForeignLanguageService = candidateForeignLanguageService;
		this.candidateImageService = candidateImageService;
		this.candidateLinkService = candidateLinkService;
		this.candidateSkillService = candidateSkillService;
	}


	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate has been added");
	}

	@Override
	public Result update(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate has been updated");
	}

	@Override
	public Result delete(int candidateId) {
		this.candidateDao.deleteById(candidateId);
		return new SuccessResult("Candidate has been deleted");
	}
	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}
	
	@Override
	public DataResult<List<Candidate>> getById(int candidateId) {

		return new SuccessDataResult<List<Candidate>>(this.candidateDao.getById(candidateId));
	}

	@Override
	public DataResult<Candidate> getCandidateByNationalId(String nationalId) {
		return new SuccessDataResult<Candidate>(this.candidateDao.findCandidateByNationalId(nationalId));
	}

	@Override
	public DataResult<CandidateResumeDto> getCandidateResumeById(int candidateId) {
		CandidateResumeDto resume = new CandidateResumeDto();
		resume.candidateEducations = this.candidateEducationService.getAllByCandidateId(candidateId).getData();
		resume.candidateExperiences = this.candidateExperienceService.getAllByCandidateId(candidateId).getData();
		resume.candidateForeignLanguages = this.candidateForeignLanguageService.getAllByCandidateId(candidateId).getData();
		resume.candidateImage = this.candidateImageService.getByCandidateId(candidateId).getData();
		resume.candidateLinks = this.candidateLinkService.getAllByCandidateId(candidateId).getData();
		resume.candidateSkills = this.candidateSkillService.getAllByCandidateId(candidateId).getData();
		resume.candidateCoverLetters = this.candidateCoverLetterService.getAllByCandidateId(candidateId).getData();
		return new SuccessDataResult<CandidateResumeDto>(resume);
	}

}
