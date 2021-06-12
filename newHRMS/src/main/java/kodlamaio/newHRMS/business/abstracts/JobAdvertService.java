package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.JobAdvert;

public interface JobAdvertService {
	
	Result add(JobAdvert jobAdvert);
	Result delete(int jobAdvertId);
	Result adjustFromOpenToClose(int id);
	DataResult<JobAdvert> getById(int id);	
	DataResult<List<JobAdvert>> getAll();
	DataResult<List<JobAdvert>> findAllOpenJobAdvertList();
	DataResult<List<JobAdvert>> getAllByOrderByPublishedDate();
	DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id);
	
}
