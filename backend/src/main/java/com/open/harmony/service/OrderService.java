package com.open.harmony.service;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Order;
import com.open.harmony.entity.OrderGoods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderService {


    /**
     * 查询所有订单
     *
     * @return
     */
//    Result findAllOrders();
    Result findAllOrders(Integer storeId);

    /**
     * 查询订单详情
     *
     * @param storeId
//     * @param orderId
     * @return
     */
//    Result findAllOrderDetail(Integer storeId, Integer orderId);
    Result findAllOrderDetail(Integer storeId);
    /**
     * 添加订单
     *
     * @param order
     * @return
     */
    Result insertOrder(Order order);


}
