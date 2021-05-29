package kodlamaio.newHRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.newHRMS.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer>{
	
	@Query("From JobAdvert where isOpen = true")
	List<JobAdvert> getAllOpenJobAdvertList();
	
	@Query("From JobAdvert where isOpen = true Order By publishedDate Asc")
	List<JobAdvert> getAllByOrderByPublishedDateAsc();
	
	@Query("From JobAdvert where isOpen = true Order By publishedDate Desc")
	List<JobAdvert> getAllByOrderByPublishedDateDesc();
	
	@Query("From JobAdvert where isOpen = true and employer_id =:id")
	List<JobAdvert> getAllOpenJobAdvertByEmployer(int id);

}
