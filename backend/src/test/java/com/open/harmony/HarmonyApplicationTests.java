package com.open.harmony;



import com.open.harmony.entity.Order;
import com.open.harmony.mapper.OrderMapper;
import com.open.harmony.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class HarmonyApplicationTests {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderService orderService;
//    @Test
//    public void test2() {
//
//        System.out.println(orderMapper.findAll());
//    }
}
