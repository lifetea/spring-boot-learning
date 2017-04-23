package com.lifetea.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lifetea on 2017/4/20.
 */
@RestController
@RequestMapping(value = "index")
public class IndexController {

    @RequestMapping(value = "")
    public String  index(){
        return "hello world";
    }
}
