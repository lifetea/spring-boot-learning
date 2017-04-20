package com.lifetea.Controller;

import com.lifetea.Model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lifetea on 2016/12/13.
 */


@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "userInfo/{id}", method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
//    @RequiresRoles("admin")


    public User getUserInfo(){
        User user = new User(5,"lisongy");
        return user;
    }
}
