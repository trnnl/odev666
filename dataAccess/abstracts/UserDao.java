package kodlamaio.hmrs.dataAccess.abstracts;

import kodlamaio.hmrs.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
