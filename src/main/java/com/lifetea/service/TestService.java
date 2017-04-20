package com.lifetea.service;

import com.lifetea.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.lifetea.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lifetea on 2017/3/31.
 */
@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public List<User> getAll(){
        return  testMapper.getAll();
    };

}
