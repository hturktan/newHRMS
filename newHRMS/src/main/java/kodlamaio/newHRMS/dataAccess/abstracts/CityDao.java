package kodlamaio.newHRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {
		
	List<City> getById(int id);

}
