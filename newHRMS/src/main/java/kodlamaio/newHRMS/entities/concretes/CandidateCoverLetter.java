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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidate_cover_letters")
public class CandidateCoverLetter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cover_letter")
	private String coverLetter;
	
	public CandidateCoverLetter(int id, String coverLetter, int candidateId) {
		super();
		this.id = id;
		this.coverLetter = coverLetter;
		this.candidate.setId(candidateId);
		
	}

	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

}
