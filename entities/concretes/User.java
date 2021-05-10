package kodlamaio.hmrs.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String eMail;

    @Column(name = "password")
    private String password;

    public User() {

    }

    public User(int id, String eMail, String password) {
        this.id = id;
        this.eMail = eMail;
        this.password = password;
    }

}
