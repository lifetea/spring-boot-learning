package com.lifetea.Controller;

import com.lifetea.Model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lifetea on 2016/12/13.
 */


@RestController
@RequestMapping("user")
@Api(description = "用户相关 ",value = "user")
public class UserController {

    @RequestMapping(value = "userInfo/{id}", method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
//    @RequiresRoles("admin")
    @ApiOperation(
            httpMethod = "GET",
            value = "获取用户信息",
            notes = "可以通过用户ID获取用户详情信息。"
    )

    @ApiImplicitParams(@ApiImplicitParam(name="id",value="用户ID",required = false,dataType = "String", paramType = "path"))
    public User getUserInfo(){
        User user = new User(5,"lisongy");
        return user;
    }
}
