package kodlamaio.hmrs.api.controllers;

import kodlamaio.hmrs.business.abstracts.JobTitleService;
import kodlamaio.hmrs.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitlesController {

    @Autowired
    private JobTitleService jobTitleService;


    @GetMapping("/getall")
    public List<JobTitle> getAll(){
        return jobTitleService.getAll();
    }
}
