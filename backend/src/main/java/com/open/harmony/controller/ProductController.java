package com.open.harmony.controller;

import com.open.harmony.common.Result;

import com.open.harmony.entity.Product;

import com.open.harmony.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    private ProductMapper productMapper;
    @GetMapping("/findAll")
    public Result selectAll(){
        List<Product> productList = productMapper.findAll();
//        System.out.println(productList);
        return Result.success(productList);
    }


    @PutMapping("/updateProduct")
    public Result updateProduct(@RequestBody Product product){
        Integer updateOne = productMapper.updateProduct(product);
        if(0 != updateOne){
            return Result.success();
        }
        else {
            return Result.error("更新失败");
        }
    }

    @PostMapping("/addProduct")
    public Result addGoods(@RequestBody Product product){
        Integer addOne = productMapper.insertProduct(product);
        if(0 != addOne){
            return Result.success();
        }
        else {
            return Result.error("插入失败");
        }
    }
    @DeleteMapping("/deleteProduct/{id}")
    public Result deleteProduct(@PathVariable Integer id){
        Integer deleteOne = productMapper.deleteProduct(id);
        if(0!=deleteOne){
            return Result.success();
        }
        else{
            return Result.error("删除失败");
        }
    }
}
