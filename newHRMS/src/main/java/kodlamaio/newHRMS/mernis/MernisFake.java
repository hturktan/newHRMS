package kodlamaio.newHRMS.mernis;

import java.util.Date;

public class MernisFake {
	
	public boolean ValidateByPersonalInfo(String nationalId, String firstName, String lastName, Date dateOfBirth) {
		
		System.out.println(firstName + " " + lastName + " is valid");
		return true;
	}
}
