package com.lifetea.util;

import com.lifetea.exception.UserException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by lifetea on 2017/4/11.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserException.class)
    @ResponseBody
    public ModelMap addErrorHandler() throws Exception{
        System.out.println("hahah");
        ModelMap modelMap = new ModelMap();
        modelMap.put("data","hahaha");
        return modelMap;
    }
}
