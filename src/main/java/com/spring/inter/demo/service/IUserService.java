package com.spring.inter.demo.service;

import com.spring.inter.demo.bean.User;

import java.util.List;

public interface IUserService {
    //获取所有的用户
    List<User> getAllUser();
    //增
    int  addUser(User user);
    //删
    int  deleteUser(long id);
    //改
    int updateUser(User user);
    //查
    User queryUser(long id);
}
