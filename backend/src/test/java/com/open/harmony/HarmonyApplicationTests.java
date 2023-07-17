package com.open.harmony;

import com.open.harmony.mapper.GoodsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HarmonyApplicationTests {
    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    void contextLoads() {
        System.out.println(goodsMapper.findAll());
    }

}
