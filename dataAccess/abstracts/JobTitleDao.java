package kodlamaio.hmrs.dataAccess.abstracts;

import kodlamaio.hmrs.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
