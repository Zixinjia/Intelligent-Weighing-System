package com.open.harmony.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.open.harmony.entity.OrderGoods;

import java.util.List;

public interface OrderGoodsService extends IService<OrderGoods> {

    public Integer insertOrderGoods(List<OrderGoods> orderGoodsList);
}
