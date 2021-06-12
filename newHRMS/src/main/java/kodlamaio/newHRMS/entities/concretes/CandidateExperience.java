package kodlamaio.newHRMS.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidate_experiences")
public class CandidateExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "work_place_names")
	@NotNull
	@NotBlank
	private String workPlaceName;
	
	@Column(name = "work_place_positions")
	@NotNull
	@NotBlank
	private String workPlacePosition;
	
	@Column(name = "position_descriptions")
	private String positionDescription;
	
	@Column(name = "start_date")
	@NotNull
	@NotBlank
	private Date startDate;
	
	@Column(name = "finish_date")
	private Date finishDate;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
}
