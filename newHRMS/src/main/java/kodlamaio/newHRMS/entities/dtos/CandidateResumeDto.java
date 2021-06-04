package kodlamaio.newHRMS.entities.dtos;

import java.util.List;

import kodlamaio.newHRMS.entities.concretes.Candidate;
import kodlamaio.newHRMS.entities.concretes.CandidateCoverLetter;
import kodlamaio.newHRMS.entities.concretes.CandidateEducation;
import kodlamaio.newHRMS.entities.concretes.CandidateExperience;
import kodlamaio.newHRMS.entities.concretes.CandidateForeignLanguage;
import kodlamaio.newHRMS.entities.concretes.CandidateImage;
import kodlamaio.newHRMS.entities.concretes.CandidateLink;
import kodlamaio.newHRMS.entities.concretes.CandidateSkill;

public class CandidateResumeDto {
	
	public Candidate candidate;
	public List<CandidateCoverLetter> candidateCoverLetters;
	public List<CandidateExperience> candidateExperiences;
	public List<CandidateEducation> candidateEducations;
	public List<CandidateForeignLanguage> candidateForeignLanguages;
	public List<CandidateSkill> candidateSkills;
	public List<CandidateLink> candidateLinks;
	public List<CandidateImage> candidateImage;
}
