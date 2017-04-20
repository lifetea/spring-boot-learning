package com.lifetea.Controller;

import com.github.pagehelper.PageInfo;
import com.lifetea.exception.UserException;
import com.lifetea.model.User;
import com.lifetea.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lifetea on 2017/04/01.
 */


@RestController
@RequestMapping("/user")
@Api(description = "用户相关",value = "用户")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
//    @RequiresRoles("admin")
    @ApiOperation(
            httpMethod = "POST",
            value = "获取用户信息",
            notes = "用户登录"
    )
    @ApiImplicitParams(@ApiImplicitParam(name="id",value="用户ID",required = false,dataType = "String", paramType = "path"))
    public void doLogin(){
        System.out.print("333333");
    }


    /**
     * 新建用户
     *
     * @author 李松阳
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/add",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    @ApiOperation(
            httpMethod = "GET",
            value = "新增用户",
            notes = "添加用户"
    )
    @ApiImplicitParams(
            @ApiImplicitParam(name="name",value="用户名",required = false,dataType = "String", paramType="query")
    )
    public void add(@RequestParam(required = true) String name) throws UserException{
//        ModelMap modelMap = new ModelMap();
//        User user = new User();
//        user.setName(name);
//        userService.insert(user);
//        modelMap.put("data",user);
//        return modelMap;
        throw  new UserException("hhh");
    }

    /**
     * 删除用户
     *
     * @author 李松阳
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    @ApiOperation(
            httpMethod = "GET",
            value = "删除用户",
            notes = "删除用户"
    )
    @ApiImplicitParams(
            @ApiImplicitParam(name="id",value="用户ID",required = true,dataType = "int", paramType="query")
    )
    public ModelMap delete(@RequestParam(required = true) int id) {
        ModelMap result = new ModelMap();
        result.put("msg","删除成功");
        User user = new User();
        user.setId(id);
        userService.delete(user);
        return result;
    }

    /**
     * 修改用户信息
     *
     * @author 李松阳
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/modify",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    @ApiOperation(
            httpMethod = "GET",
            value = "修改用户",
            notes = "修改用户"
    )
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name",value= "用户姓名",required = true,dataType = "String", paramType="query"),
        @ApiImplicitParam(name = "id", value = "用户ID",required = true,dataType = "int", paramType="query")
    })
    public String modify(@RequestParam(required = true) String name,@RequestParam(required = true) int id) {
        User user = new User();
        user.setName(name);
        user.setId(id);
        userService.modify(user);
        return "Success";
    }


    /**
     * 查询单个用户
     *
     * @author 李松阳
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findOne",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    @ApiOperation(
            httpMethod = "GET",
            value = "通过id查用户",
            notes = "修改用户"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID",required = false,dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "name", value = "用户ID",required = false,dataType = "int", paramType="query")
    })
    public ModelMap findOne(@RequestParam(required = false) int id) {
        ModelMap modelMap = new ModelMap();
        modelMap.put("msg","success");
        User user = new User();
        user.setId(id);
        modelMap.put("data",userService.find(user));
        return modelMap;
    }


    /**
     * 查询全部
     *
     * @author 李松阳
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getAll",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    @ApiOperation(
            httpMethod = "GET",
            value = "通过id查用户",
            notes = "修改用户"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID",required = false,dataType = "int", paramType="query"),
            @ApiImplicitParam(name = "name", value = "用户ID",required = false,dataType = "int", paramType="query")
    })
    public ModelMap getAll() {
        ModelMap modelMap = new ModelMap();
        modelMap.put("msg","success");
        User user = new User();
        List<User> userList = userService.getAll(user);

        modelMap.put("data",new PageInfo<User>(userList));

//        List<User> countryList = userService.getAll(user);
        return modelMap;
    }


}
