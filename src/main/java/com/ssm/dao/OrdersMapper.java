package com.ssm.dao;

import com.ssm.entity.Orders;

import java.util.List;

public interface OrdersMapper {
    public List<Orders> findOrder();
}
