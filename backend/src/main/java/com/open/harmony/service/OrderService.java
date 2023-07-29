package com.open.harmony.service;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderService {

    /**
     * 查询所有订单
     * @return
     */
    Result findAllOrders();


    /**
     * 添加订单
     * @param order
     * @return
     */
    Result insertOrder(Order order);
}
