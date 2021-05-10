package kodlamaio.hmrs.business.abstracts;

import kodlamaio.hmrs.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
