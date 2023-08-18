package com.open.harmony.service;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;


public interface ProductService {

    /**
     * 查询商品
     * @return
     */
    Result findAll();

    /**
     * 增加商品
     * @param product
     * @return
     */
    Result insertProduct(Product product);

    /**
     * 更新商品
     * @param product
     * @return
     */
    Result updateProduct(Product product);

    /**
     *
     * @param product
     * @return
     */
    Result deleteProduct(Product product);
}
