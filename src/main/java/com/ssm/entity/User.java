package com.ssm.entity;

import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;

    //一个用户对应多个订单
    private List<Orders> ordersList;

    //当前用户具备哪些角色 一个用户可以有多个角色，一个角色可以被多个用户使用
    private List<Role> roleList;


    public User() {
    }

    public User(int id, String username, String password, List<Orders> ordersList, List<Role> roleList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ordersList = ordersList;
        this.roleList = roleList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ordersList=" + ordersList +
                ", roleList=" + roleList +
                '}';
    }
}
