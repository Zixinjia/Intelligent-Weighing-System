package com.open.harmony.mapper;

import com.open.harmony.entity.Order;

import com.open.harmony.entity.OrderGoods;
import com.open.harmony.entity.Product;
import com.open.harmony.entity.dto.OrderDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {

    /**
     * 查找所有订单
     * @return
     */
//    @Select("select * from `order`")
//    List<Order> findAll();

    /**
     * 查询所有订单
     * @param storeId
     * @return
     */
    @Select("select b.store_id,b.order_id,b.total_price,b.created_time,a.goods_name,a.goods_weight,a.goods_price," +
            "a.goods_total_price from `order` as b, order_goods as a " +
            "where a.store_id = b.store_id and  a.store_id = #{storeId}  and a.order_id = b.order_id")
    List<Order> findAllOrder(Integer storeId);

    /**
     * 查询某订单中的详情
     * @return
     */
//    @Select("select * from order_goods where store_id = #{storeId} and order_id = #{orderId}")
//    List<OrderGoods> findAllOrderDetail(Integer storeId, Integer orderId);

    @Select("select * from order_goods where store_id = #{storeId} ")
    List<OrderGoods> findAllOrderDetail(Integer storeId);
    /**
     * 插入订单
     * @param order
     * @return
     */
    @Insert("insert into `order`( store_id, total_price, status,created_time,update_time) " +
            "VALUES (#{storeId},#{totalPrice},#{status},#{createdTime},#{updateTime})")
    Integer insertOrder(Order order);


}
