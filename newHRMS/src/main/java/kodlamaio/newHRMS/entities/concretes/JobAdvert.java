package kodlamaio.newHRMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_adverts")
public class JobAdvert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name = "city_id")
//	private int cityId;
//	
//	@Column(name = "job_position_id")
//	private int jobPositionId;
//	
//	@Column(name = "employer_id")
//	private int employerId;
	
	@Column(name = "open_position_number")
	private int openPositionNumber;
	
	@Column(name = "deadline")
	private Date deadline;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "published_date")
	private Date publishedDate;
	
	@Column(name = "salary_min")
	private int salaryMin;
	
	@Column(name = "salary_max")
	private int salaryMax;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "is_open")
	private boolean isOpen;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "is_deleted")
	private boolean isDeleted;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;

}
