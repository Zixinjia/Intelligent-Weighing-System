package com.open.harmony.controller;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Goods;
import com.open.harmony.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/goods")
@RestController
public class GoodsController {

    @Autowired
    private GoodsMapper goodsMapper;
    @GetMapping("/findAll")
    public Result selectAll(){
        List<Goods> goodsList = goodsMapper.findAll();
        System.out.println(goodsList);
        return Result.success(goodsList);
    }


    @PutMapping("/updateGoods")
    public Result updateGoods(@RequestBody Goods goods){
        Integer updateOne = goodsMapper.updateGoods(goods);
        if(0 != updateOne){
            return Result.success();
        }
        else {
            return Result.error("更新失败");
        }
    }

    @PostMapping("/addGoods")
    public Result addGoods(@RequestBody Goods goods){
        Integer addOne = goodsMapper.insertGoods(goods);
        if(0 != addOne){
            return Result.success();
        }
        else {
            return Result.error("插入失败");
        }
    }


}
