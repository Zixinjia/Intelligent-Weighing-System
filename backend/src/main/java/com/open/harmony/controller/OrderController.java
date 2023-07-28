package com.open.harmony.controller;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Order;
import com.open.harmony.entity.OrderGoods;
import com.open.harmony.mapper.OrderMapper;
import com.open.harmony.service.OrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author honor
 * @version 1.0
 * Create by 2023/7/28 15:51
 */

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderGoodsService orderGoodsService;

    @Autowired
    private OrderMapper orderMapper;
    /**
     * 插入订单单品列表
     * @param orderGoodsList
     * @return
     */
    @PostMapping("/addOrderGoods")
    public Result insertOrderGoods(@RequestBody List<OrderGoods> orderGoodsList){
        orderGoodsService.saveBatch(orderGoodsList);
        return Result.success();
    }

    /**
     * 添加订单
     * @param order
     * @return
     */
    @PostMapping("/addOrder")
    public Result insertOrder(@RequestBody Order order){
        order.setCreatedTime(new Date());
        order.setUpdateTime(new Date());
        int orderInsert = orderMapper.insertOrder(order);
        if (orderInsert ==0) {
            return Result.error("插入失败");
        }
        else{
            return Result.success();
        }
    }

    /**
     * 查询所有订单
     * @return
     */
    @GetMapping("/findAllOrders")
    public Result selectAllOrder(){
        List<Order> orderList = orderMapper.findAllOrders();
        return Result.success(orderList);
    }

}
