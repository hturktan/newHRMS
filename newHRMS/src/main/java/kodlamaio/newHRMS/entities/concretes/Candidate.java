package kodlamaio.newHRMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User{
	
//	@Id
//	@GeneratedValue
//	@Column(name = "user_id")
//	private int userId;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "nationality_id", nullable = false)
	private String nationalId;
	
	@Column(name = "date_of_birth", nullable = false)
	private Date dateOfBirth;
	
	public Candidate() {
		
	}

	public Candidate(String firstName, String lastName, String nationalId, Date dateOfBirth) {
		super();
//		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.dateOfBirth = dateOfBirth;
	}

//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
