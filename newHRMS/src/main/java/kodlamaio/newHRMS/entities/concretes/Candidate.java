package kodlamaio.newHRMS.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User{
	
//	@Id
//	@GeneratedValue//	@Column(name = "user_id")
//	private int userId;
		
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "nationality_id", nullable = false)
	private String nationalId;
	
	@Column(name = "date_of_birth", nullable = false)
	private java.util.Date dateOfBirth;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateCoverLetter> candidateCoverLetters;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateEducation> candidateEducations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateExperience> candidateExperiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateForeignLanguage> candidateForeignLanguages;

	@JsonIgnore
	@OneToOne(mappedBy = "candidate", fetch=FetchType.LAZY)
	private CandidateImage candidateImage;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateSkill> candidateSkills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateLink> candidateLinks;
}
