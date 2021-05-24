package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.User;

public interface UserService {
	
	DataResult<List<User>> getAll();
	DataResult<User> getUserByEmail(String email);
	Result add(User user);
	
}
