package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.WorkingTypeService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.WorkingTypeDao;
import kodlamaio.newHRMS.entities.concretes.WorkingType;

@Service
public class WorkingTypeManager implements WorkingTypeService{
	
	private WorkingTypeDao workingTypeDao;
	
	@Autowired
	public WorkingTypeManager(WorkingTypeDao workingTypeDao) {
		super();
		this.workingTypeDao = workingTypeDao;
	}

	@Override
	public Result add(WorkingType workingType) {
		this.workingTypeDao.save(workingType);
		return new SuccessResult("New Working Type is added");
	}

	@Override
	public Result delete(WorkingType workingType) {
		this.workingTypeDao.delete(workingType);
		return new SuccessResult("Working Type is deleted");
	}

	@Override
	public DataResult<List<WorkingType>> getAll() {
		
		return new SuccessDataResult<List<WorkingType>>(this.workingTypeDao.findAll(), "Working Types are listed");
	}
	
}
