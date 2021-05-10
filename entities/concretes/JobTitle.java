package kodlamaio.hmrs.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "job_titles")
public class JobTitle {

    @Id
    @Column(name="id")
    @GeneratedValue
    private int id;

    @Column(name="title")
    private String title;

}
