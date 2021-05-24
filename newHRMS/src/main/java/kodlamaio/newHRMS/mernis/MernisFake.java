package kodlamaio.newHRMS.mernis;

public class MernisFake {
	
	public boolean ValidateByPersonalInfo(String nationalId, String firstName, String lastName, String dateOfBirth) {
		
		System.out.println(firstName + " " + lastName + " is valid");
		return true;
	}
}
