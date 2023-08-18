package com.open.harmony.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    private OrderMapper orderMapper;
    @Autowired
    private OrderGoodsService orderGoodsService;

    @Autowired
    private OrderService orderService;

    /**
     * 插入订单单品列表
     *
     * @param orderGoodsList
     * @return
     */

    @ApiOperation("批量插入订单单品列表")
    @PostMapping("/addOrderGoods")
    public Result insertOrderGoods(@RequestBody List<OrderGoods> orderGoodsList) {
        orderGoodsService.saveBatch(orderGoodsList);
        return Result.success();
    }

    /**
     * 添加订单
     *
     * @param order
     * @return
     */

//   此方法暂时用mapper注入
    @ApiOperation("添加订单")
    @PostMapping("/addOrder")
    public Result insertOrder(@RequestBody Order order) {
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

    /**
     * 查询所有订单
     *
     * @return
     */
//   此方法暂时用mapper注入
    @ApiOperation("查询所有订单")
    @GetMapping("/findAll")
    public Result selectAllOrder() {
        return Result.success(orderMapper.findAll());
    }


}
