package com.ssm.dao;

import com.ssm.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> findAll();
    public boolean addUser(User user);
    public boolean delUser(int id);
    public boolean updateUser(User user);
    public User findByCondition(User user);
    public List<User> findByIds(int[] ids);
    public List<User> findUserOrder();
    public List<User> findUserRole();
}
