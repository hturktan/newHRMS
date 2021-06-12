package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.WorkingHour;

public interface WorkingHourService {
	
	Result add(WorkingHour workingHour);
	Result delete(WorkingHour workingHour);
	DataResult<List<WorkingHour>> getAll();
}
