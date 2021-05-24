package kodlamaio.newHRMS.core.utilities.adapters;

import kodlamaio.newHRMS.mernis.MernisFake;

public class FakeMernisAdapter implements ValidationService{

	@Override
	public boolean validateByFakeMernis(String natioanalId, String firstName, String lastName, String dateOfBirth) {
		
		MernisFake fake = new MernisFake();
		
		boolean result = true;
		try {
			result = fake.ValidateByPersonalInfo(natioanalId, firstName, lastName, dateOfBirth);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
