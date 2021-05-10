package kodlamaio.hmrs.api.controllers;

import kodlamaio.hmrs.business.abstracts.UserService;
import kodlamaio.hmrs.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UsersController {

    @Autowired
    private UserService userService;



    @GetMapping("/getall")
    public List<User> getAll(){
        return this.userService.getAll();

    }


}
