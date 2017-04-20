package com.lifetea.mapper;

import com.lifetea.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lifetea on 2017/3/31.
 */
@Mapper
public interface TestMapper{
    @Select("SELECT * FROM USER WHERE 1 = 1")
    List<User> getAll();
}

//public interface UserMapper {
//    @Select("SELECT * FROM USER WHERE NAME = #{name}")
//    User findByName(@Param("name") String name);
//    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
//    int insert(@Param("name") String name, @Param("age") Integer age);
//}