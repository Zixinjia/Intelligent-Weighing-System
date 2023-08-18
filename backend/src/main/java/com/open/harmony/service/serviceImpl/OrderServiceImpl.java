package com.open.harmony.service.serviceImpl;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Order;
import com.open.harmony.mapper.OrderMapper;
import com.open.harmony.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author honor
 * @version 1.0
 * Create by 2023/7/29 9:45
 */
@Service
public class OrderServiceImpl implements OrderService {
    private OrderMapper orderMapper;

    /**
     * 查询订单
     * @return
     */
    //controller暂时使用mapper
    @Override
    public Result findAllOrders() {
        List<Order> orderList = orderMapper.findAll();
        return Result.success(orderList);
    }

    /**
     * 插入订单
     * @param order
     * @return
     */
    //controller暂时使用mapper
    @Override
    public Result insertOrder(Order order) {
        order.setCreatedTime(new Date());
        order.setUpdateTime(new Date());
        Integer orderInsert = orderMapper.insertOrder(order);
        if (orderInsert==0) {
            return Result.error("插入失败");
        }
        else{
            return Result.success();
        }
    }
}
