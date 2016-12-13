package com.lifetea.Model;

/**
 * Created by lifetea on 2016/12/13.
 */
public class User {
    private Integer age;
    private String name;
    public User(Integer age,String name){
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
