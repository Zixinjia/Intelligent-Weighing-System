package com.open.harmony.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.open.harmony.entity.OrderGoods;
import com.open.harmony.mapper.OrderGoodsMapper;
import com.open.harmony.service.OrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author honor
 * @version 1.0
 * Create by 2023/7/28 15:45
 */
@Service
public class OrderGoodsServiceImpl  extends ServiceImpl<OrderGoodsMapper, OrderGoods> implements OrderGoodsService {

    @Autowired
    private OrderGoodsMapper orderGoodsMapper;


    @Override
    public Integer insertOrderGoods(List<OrderGoods> orderGoodsList){
        return null;
    }
}
