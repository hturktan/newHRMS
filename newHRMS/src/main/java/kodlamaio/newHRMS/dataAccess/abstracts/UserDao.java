package kodlamaio.newHRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.newHRMS.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
