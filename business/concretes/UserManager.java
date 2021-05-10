package kodlamaio.hmrs.business.concretes;

import kodlamaio.hmrs.business.abstracts.UserService;
import kodlamaio.hmrs.dataAccess.abstracts.UserDao;
import kodlamaio.hmrs.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserManager implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
