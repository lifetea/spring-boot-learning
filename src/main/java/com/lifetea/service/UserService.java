package com.lifetea.service;

import com.lifetea.mapper.UserMapper;
import com.lifetea.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public void insert(User user){
        userMapper.insert(user);
    }

    public void delete(User user){
        userMapper.delete(user);
    }

    public void modify(User user){
        userMapper.updateByPrimaryKeySelective(user);
    }

    public List<User> find(User user){
       return userMapper.select(user);
    }

    public User findOne(User user){
        return userMapper.selectOne(user);
    }

    public List<User> getAll(User user){
        if (user.getPage() != null && user.getRows() != null) {
            PageHelper.startPage(user.getPage(), user.getRows());
        }
        return userMapper.selectAll();
    }


}
