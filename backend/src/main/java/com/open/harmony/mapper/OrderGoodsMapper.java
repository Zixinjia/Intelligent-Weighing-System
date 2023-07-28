package com.open.harmony.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.open.harmony.entity.Order;
import com.open.harmony.entity.OrderGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderGoodsMapper extends BaseMapper<OrderGoods> {


    public Integer insertOrderGoods(List<OrderGoods> orderGoodsList);
}
