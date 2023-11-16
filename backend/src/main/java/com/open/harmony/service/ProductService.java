package com.open.harmony.service;
import com.open.harmony.common.Result;
import com.open.harmony.entity.Product;

public interface ProductService {

    /**
     * 查询商品
     *
     * @return
     */
    Result findAll();

    /**
     * 根据商户id查询商品
     *
     * @return
     */
    Result findAllByStoreId(Integer storeId);

    /**
     * 增加商品
     *
     * @param product
     * @return
     */
    Result insertProduct(Product product);

    /**
     * 更新商品
     *
     * @param product
     * @return
     */
    Result updateProduct(Product product);

    /**
     * 删除商品
     *
     * @param name
     * @param storeId
     * @return
     */
    Result deleteProduct(String name, Integer storeId);
}
