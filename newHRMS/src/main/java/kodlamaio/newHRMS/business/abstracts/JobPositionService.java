package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import kodlamaio.newHRMS.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
