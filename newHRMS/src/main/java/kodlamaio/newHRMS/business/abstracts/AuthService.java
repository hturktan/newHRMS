package kodlamaio.newHRMS.business.abstracts;


import java.util.Date;

import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.Candidate;
import kodlamaio.newHRMS.entities.concretes.Employer;

@Service
public interface AuthService {

	Result registerCandidate(Candidate candidate);
	Result registerEmployer(Employer employer);
	boolean checkIfRealPerson(String firstName, String lastName, String nationalId, Date dateOfBirth);
	boolean checkIfRealCompany(String companyName, String webAddress, String phoneNumber);
}
