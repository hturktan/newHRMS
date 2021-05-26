package kodlamaio.newHRMS.business.concretes;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.AuthService;
import kodlamaio.newHRMS.business.abstracts.CandidateService;
import kodlamaio.newHRMS.business.abstracts.EmployeeService;
import kodlamaio.newHRMS.business.abstracts.EmployerService;
import kodlamaio.newHRMS.business.abstracts.UserService;
import kodlamaio.newHRMS.core.utilities.results.ErrorResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.entities.concretes.Candidate;
import kodlamaio.newHRMS.entities.concretes.Employer;

@Service
public class AuthManager implements AuthService {
	
	private UserService userService;
	private CandidateService candidateService;
	private EmployerService employerService;
	private EmployeeService employeeService;
	private String confirmPassword;
	
	
	@Autowired
	public AuthManager(UserService userService, CandidateService candidateService, EmployerService employerService, EmployeeService employeeService) {
		super();
		this.userService = userService;
		this.candidateService = candidateService;
		this.employerService = employerService;
		this.employeeService = employeeService;
	}


	
	@Override
	public boolean checkIfRealPerson(String firstName, String lastName, String nationalId, Date dateOfBirth) {
		return false;
	}


	
	@Override
	public boolean checkIfRealCompany(String companyName, String webAddress, String phoneNumber) {
		return false;
	}


	@Override
	public Result registerCandidate(Candidate candidate) {
		if(checkIfRealPerson(candidate.getFirstName(), candidate.getLastName(), candidate.getNationalId(), candidate.getDateOfBirth()) == false){
			
			return new ErrorResult("Person is not valid!");
			
		}if(checkIfNullValueInCandidates(candidate)) {
			
			return new ErrorResult("There is/are some empty space/s in the form");
			
		}if(!checkIfExistNationalId(candidate.getNationalId())) {
			
			return new ErrorResult("There is a national ID error");
			
		}if(!checkIfEmailExist(candidate.getEmail())) {
			
			return new ErrorResult("There is an email error");
		}
		
		candidateService.add(candidate);
		return new SuccessResult("Candidate " + candidate.getFirstName() + candidate.getLastName() + " registration completed");
	}
	

	
	@Override
	public Result registerEmployer(Employer employer) {
		
		if(checkIfRealCompany(employer.getCompanyName(), employer.getWebAddress(), employer.getPhoneNumber()) == false) {
			
			return new ErrorResult("Employer is not valid!");
			
		}if(!checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebAddress())) {
			
			return new ErrorResult("Email address is not valid!");
			
		}if(!checkIfEmailExist(employer.getEmail())) {
			
			return new ErrorResult("Email address is already in database.");
		
		}if(!checkIfEqualPasswordAndConfirmPassword(employer.getPassword(), confirmPassword)) {
			
			return new ErrorResult("Passwords do not match!");
		}
		
		employerService.add(employer);
		return new SuccessResult("Employer "+ employer.getCompanyName() + " is added");
	}
	
	
	private boolean checkIfExistNationalId(String nationalId) {
		if (this.candidateService.getCandidateByNationalId(nationalId).getData() == null) {
			return true;
		}
		return false;
	}

	
	private boolean checkIfNullValueInCandidates(Candidate candidate) {
		if (candidate.getFirstName() != null && candidate.getLastName() != null && candidate.getEmail() != null
				&& candidate.getPassword() != null && candidate.getDateOfBirth() != null) {

			return true;

		}
		
		return false;
	}
	
	private boolean checkIfEqualEmailAndDomain(String email, String webAddress) {

		String[] emailArr = email.split("@", 2);
		String domain = webAddress.substring(4, webAddress.length());

		if (emailArr[1].equals(domain)) {
			return true;
		}

		return false;

	}
	
	
	private boolean checkIfEmailExist(String email) {
		if (this.userService.getUserByEmail(email).getData() == null) {
			return true;
		}
		return false;

	}
	
	private boolean checkIfEqualPasswordAndConfirmPassword(String password, String confirmPassword) {

		if (!password.equals(confirmPassword)) {
			return false;
		}

		return true;
	}

}
	
	
