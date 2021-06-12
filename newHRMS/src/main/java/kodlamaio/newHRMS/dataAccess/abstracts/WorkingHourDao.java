package kodlamaio.newHRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.WorkingHour;

public interface WorkingHourDao extends JpaRepository<WorkingHour, Integer>{

}
