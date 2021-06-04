package kodlamaio.newHRMS.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidate_educations")
public class CandidateEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "school_names")
	@NotNull
	@NotBlank
	private String schoolName;
	
	@Column(name = "department_names")
	@NotNull
	@NotBlank
	private String departmentName;
	
	@Column(name = "year")
	@NotNull
	@NotBlank
	private int startYear;
	
	@Column(name = "finish_year")
	private int finishYear;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
}
