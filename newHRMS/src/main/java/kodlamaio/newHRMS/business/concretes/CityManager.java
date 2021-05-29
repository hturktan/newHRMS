package kodlamaio.newHRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.newHRMS.business.abstracts.CityService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.CityDao;
import kodlamaio.newHRMS.entities.concretes.City;

@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
	
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
	}

}
