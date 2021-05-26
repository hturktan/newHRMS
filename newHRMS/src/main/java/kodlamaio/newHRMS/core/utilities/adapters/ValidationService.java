package kodlamaio.newHRMS.core.utilities.adapters;

import java.util.Date;

public interface ValidationService {
	boolean validateByFakeMernis(String natioanalId, String firstName, String lastName, Date dateOfBirth);
}
