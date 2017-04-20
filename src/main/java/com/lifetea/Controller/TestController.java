package com.lifetea.Controller;

import com.lifetea.model.User;
import com.lifetea.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lifetea on 2017/3/31.
 */
@RestController
@RequestMapping("test")
@Api(description = "测试相关",value = "测试")
public class TestController {

    @Autowired
    private TestService testService;
    /**
     * 新建用户
     *
     * @author 李松阳
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/all",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    @ApiOperation(
            httpMethod = "GET",
            value = "新增用户",
            notes = "添加用户"
    )
//    @ApiImplicitParams(
//            @ApiImplicitParam(name="name",value="用户名",required = false,dataType = "String", paramType="query")
//    )
    public ModelMap all(/*@RequestParam(required = true) String name*/) {
        ModelMap modelMap = new ModelMap();
        List<User> list = testService.getAll();
//        User user = new User();
//        user.setName(name);
//        userService.insert(user);
        modelMap.put("data",list);
        return modelMap;
    }


}
