package com.open.harmony.mapper;

import com.open.harmony.entity.Order;
import com.open.harmony.entity.OrderGoods;
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
    @Select("select * from `order`")
    List<Order> findAll();


    /**
     * 插入订单
     * @param order
     * @return
     */
    @Insert("insert into `order`( store_id, total_price, content,status,created_time,update_time) " +
            "VALUES (#{storeId},#{totalPrice},#{content},#{status},#{createdTime},#{updateTime})")
    Integer insertOrder(Order order);


}
