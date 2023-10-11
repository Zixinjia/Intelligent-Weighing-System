package com.open.harmony.service.serviceImpl;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Product;
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
     * 根据商户id查询商品
     * @return
     */
    @Override
    public Result findAllByStoreId(Integer storeId) {
        List<Product> productList = productMapper.findAllByStoreId(storeId);
        return Result.success(productList);
    }



    /**
     * 添加商品
     * @param product
     * @return
     */
    @Override
    public Result insertProduct(Product product) {
        product.setCreatedTime(new Date());
        product.setUpdateTime(new Date());
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
        product.setUpdateTime(new Date());
        Integer updateOne = productMapper.updateProduct(product);

        if(0 != updateOne){
            return Result.success();
        }
        else {
            return Result.error("更新失败");
        }
    }
//
//    /**
//     *
//     * @param product
//     * @return
//     */
//    @Override
//    public Result deleteProduct(Product product) {
//        String name = product.getProductName();
//        Integer storeId = product.getStoreId();
//        Integer deleteOne = productMapper.deleteProduct(name,storeId);
//        if(0!=deleteOne){
//            return Result.success();
//        }
//        else{
//            return Result.error("删除失败");
//        }
//    }
@Override
public Result deleteProduct(String name, Integer storeId) {

    Integer deleteOne = productMapper.deleteProduct(name,storeId);
    if(0!=deleteOne){
        return Result.success();
    }
    else{
        return Result.error("删除失败");
    }
}
}
