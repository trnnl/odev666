package kodlamaio.hmrs.business.abstracts;

import kodlamaio.hmrs.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    List<JobTitle> getAll();
}
