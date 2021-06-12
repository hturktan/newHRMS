package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.WorkingType;

public interface WorkingTypeService {
	
	Result add(WorkingType workingType);
	Result delete(WorkingType workingType);
	DataResult<List<WorkingType>> getAll();
}
