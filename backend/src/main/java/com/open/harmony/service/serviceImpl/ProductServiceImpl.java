package com.open.harmony.service.serviceImpl;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Product;
import com.open.harmony.mapper.OrderMapper;
import com.open.harmony.mapper.ProductMapper;
import com.open.harmony.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author honor
 * @version 1.0
 * Create by 2023/7/29 9:05
 */

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;


    /**
     * 查询所有商品
     * @return
     */
    @Override
    public Result findAll() {
        List<Product> productList = productMapper.findAll();
        return Result.success(productList);
    }

    /**
     * 添加商品
     * @param product
     * @return
     */
    @Override
    public Result insertProduct(Product product) {
        Integer addOne = productMapper.insertProduct(product);
        if(0 != addOne){
            return Result.success();
        }
        else {
            return Result.error("插入失败");
        }
    }

    /**
     * 更新商品
     * @param product
     * @return
     */
    @Override
    public Result updateProduct(Product product) {
        Integer updateOne = productMapper.updateProduct(product);
        if(0 != updateOne){
            return Result.success();
        }
        else {
            return Result.error("更新失败");
        }
    }

    /**
     * 删除商品
     * @param id
     * @return
     */
    @Override
    public Result deleteProduct(Integer id) {
        Integer deleteOne = productMapper.deleteProduct(id);
        if(0!=deleteOne){
            return Result.success();
        }
        else{
            return Result.error("删除失败");
        }
    }
}
