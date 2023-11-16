package com.open.harmony.service.serviceImpl;
import com.open.harmony.common.Result;
import com.open.harmony.entity.Order;
import com.open.harmony.entity.OrderGoods;
import com.open.harmony.mapper.OrderMapper;
import com.open.harmony.service.OrderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    private static final Logger logger = LogManager.getLogger(OrderServiceImpl.class);
    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    /**
     * 查询订单
     * @param storeId
     * @return
     */
    @Override
    public Result findAllOrders(Integer storeId) {
        List<Order> orderList = orderMapper.findAllOrder(storeId);
        logger.info("orderList: {}", orderList);
        return Result.success(orderList);
    }

    /**
     * 查询订单详情
     * @param storeId
    //     * @param orderId
     * @return
     */
    @Override
    public Result findAllOrderDetail(Integer storeId) {
        List<OrderGoods> orderGoods = orderMapper.findAllOrderDetail(storeId);
        return Result.success(orderGoods);
    }

    /**
     * 插入订单
     *
     * @param order
     * @return
     */
    @Override
    public Result insertOrder(Order order) {
        order.setCreatedTime(new Date());
        order.setUpdateTime(new Date());
        Integer orderInsert = orderMapper.insertOrder(order);
        if (orderInsert == 0) {
            return Result.error("插入失败");
        } else {
            return Result.success();
        }
    }
}
//controller暂时使用mapper
//    @Override
//    public Result findAllOrders() {
//        List<Order> orderList = orderMapper.findAll();
//        return Result.success(orderList);
//    }
//    public Result findAllOrderDetail(Integer storeId, Integer orderId) {
//        List<OrderGoods> orderGoods = orderMapper.findAllOrderDetail(storeId,orderId) ;
//        return Result.success(orderGoods);
//    }