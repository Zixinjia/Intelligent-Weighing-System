package com.open.harmony.controller;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Order;
import com.open.harmony.entity.OrderGoods;
import com.open.harmony.mapper.OrderMapper;
import com.open.harmony.service.OrderGoodsService;
import com.open.harmony.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author honor
 * @version 1.0
 * Create by 2023/7/28 15:51
 */
@Api(tags = "订单模块")
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderGoodsService orderGoodsService;

    @Autowired
    private OrderService orderService;
    /**
     * 插入订单单品列表
     * @param orderGoodsList
     * @return
     */
    @ApiOperation("批量插入订单单品列表")
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
    @ApiOperation("添加订单")
    @PostMapping("/addOrder")
    public Result insertOrder(@RequestBody Order order){
        return orderService.insertOrder(order);
    }

    /**
     * 查询所有订单
     * @return
     */
    @ApiOperation("查询所有订单")
    @GetMapping("/findAllOrders")
    public Result selectAllOrder(){
        return orderService.findAllOrders();
    }

}
