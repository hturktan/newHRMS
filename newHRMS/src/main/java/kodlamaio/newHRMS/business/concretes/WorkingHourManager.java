package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.WorkingHourService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.WorkingHourDao;
import kodlamaio.newHRMS.entities.concretes.WorkingHour;

@Service
public class WorkingHourManager implements WorkingHourService{
	
	private WorkingHourDao workingHourDao;
	
	@Autowired
	public WorkingHourManager(WorkingHourDao workingHourDao) {
		super();
		this.workingHourDao = workingHourDao;
	}

	@Override
	public Result add(WorkingHour workingHour) {
		this.workingHourDao.save(workingHour);
		return new SuccessResult("New Working Hour is added");
	}

	@Override
	public Result delete(WorkingHour workingHour) {
		this.workingHourDao.delete(workingHour);
		return new SuccessResult("Working Hour is deleted");
	}

	@Override
	public DataResult<List<WorkingHour>> getAll() {
		
		return new SuccessDataResult<List<WorkingHour>>(this.workingHourDao.findAll(), "Working Hour is listed");
	}

}
