package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.JobAdvertService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.newHRMS.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {

	private  JobAdvertDao jobAdvertDao;
	
	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("Job advert is added");
	}
	
	@Override
	public Result delete(int jobAdvertId) {
		this.jobAdvertDao.deleteById(jobAdvertId);
		return new SuccessResult("Job advert is deleted");
	}


	@Override
	public Result adjustFromOpenToClose(int id) {
		
		return new SuccessResult("Job position is deactivated");
	}

	@Override
	public DataResult<JobAdvert> getById(int id) {
		//https://stackoverflow.com/questions/52656517/no-serializer-found-for-class-org-hibernate-proxy-pojo-bytebuddy-bytebuddyinterc
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getById(id));
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll());
		
	}


	@Override
	public DataResult<List<JobAdvert>> findAllOpenJobAdvertList() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertList());
	}


	@Override
	public DataResult<List<JobAdvert>> getAllByOrderByPublishedDate() {
		if(jobAdvertDao.getAllByOrderByPublishedDateDesc() != null) {
			return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllByOrderByPublishedDateDesc());

		}else {
			return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllByOrderByPublishedDateAsc());
		}
	}


	@Override
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id) {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertByEmployer(id));
	}


	
}
