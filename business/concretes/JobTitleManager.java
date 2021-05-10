package kodlamaio.hmrs.business.concretes;

import kodlamaio.hmrs.business.abstracts.JobTitleService;
import kodlamaio.hmrs.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hmrs.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    @Autowired
    private JobTitleDao jobTitleDao;


    @Override
    public List<JobTitle> getAll() {
        return jobTitleDao.findAll();
    }
}
